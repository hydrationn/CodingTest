import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[][] intArr = new int[N][2];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      intArr[i][0] = Integer.parseInt(st.nextToken());
      intArr[i][1] = Integer.parseInt(st.nextToken());
    }

    // 람다식 이용
    Arrays.sort(intArr, (e1, e2) -> {
      return e1[1] != e2[1] ? e1[1]-e2[1] : e1[0]-e2[0];
    });

    for (int i = 0; i < N; i++) {
      bw.write(intArr[i][0] + " " + intArr[i][1] + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}