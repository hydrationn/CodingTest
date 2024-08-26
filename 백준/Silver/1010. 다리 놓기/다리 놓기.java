import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Dynamic Programming
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int T = Integer.parseInt(br.readLine());

    int max = 30;
    int[][] intArr = new int[max+1][max+1];

    for (int i = 1; i < max+1; i++) {
      for (int j = 1; j < max+1; j++) {
        intArr[i][i] = 1;
        intArr[i][0] = 1;
      }
    }

    for (int i = 2; i <= max; i++) {
      for (int j = 1; j <= max; j++) {
        intArr[i][j] = intArr[i-1][j-1] + intArr[i-1][j];
      }
    }

    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());

      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      bw.write(intArr[M][N] + "\n");
    }

    br.close();
    bw.flush();
    br.close();
  }
}
