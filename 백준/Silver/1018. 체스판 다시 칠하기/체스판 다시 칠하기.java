import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    private static final int BOARD_SIZE = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] dimensions = br.readLine().split(" ");
        int N = Integer.parseInt(dimensions[0]);
        int M = Integer.parseInt(dimensions[1]);

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minChanges = Integer.MAX_VALUE;

        for (int startRow = 0; startRow <= N - BOARD_SIZE; startRow++) {
            for (int startCol = 0; startCol <= M - BOARD_SIZE; startCol++) {
                minChanges = Math.min(minChanges, getMinChanges(board, startRow, startCol));
            }
        }

        bw.write(String.valueOf(minChanges));
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }

    private static int getMinChanges(char[][] board, int startRow, int startCol) {
        int changesForPattern1 = 0;
        int changesForPattern2 = 0;

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                char expectedChar1 = ((i + j) % 2 == 0) ? 'W' : 'B';
                char expectedChar2 = ((i + j) % 2 == 0) ? 'B' : 'W';

                if (board[startRow + i][startCol + j] != expectedChar1) {
                    changesForPattern1++;
                }
                if (board[startRow + i][startCol + j] != expectedChar2) {
                    changesForPattern2++;
                }
            }
        }

        return Math.min(changesForPattern1, changesForPattern2);
    }
}
