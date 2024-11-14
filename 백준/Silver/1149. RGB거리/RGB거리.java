import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());

    int[][] homeArr = new int[N+1][3];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 3; j++) {
        homeArr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 1; i < N; i++) {
      homeArr[i][0] += Math.min(homeArr[i-1][1], homeArr[i-1][2]);
      homeArr[i][1] += Math.min(homeArr[i-1][0], homeArr[i-1][2]);
      homeArr[i][2] += Math.min(homeArr[i-1][0], homeArr[i-1][1]);
    }

    bw.write(Math.min(homeArr[N-1][0], Math.min(homeArr[N-1][1], homeArr[N-1][2])) + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
