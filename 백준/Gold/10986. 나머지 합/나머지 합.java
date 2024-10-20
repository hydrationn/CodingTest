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
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    long[] sumArr = new long[N];
    int[] MArr = new int[N];
    int[] CombArr = new int[M];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());

      if (i == 0) {
        sumArr[0] = num;
      } else {
        sumArr[i] = sumArr[i-1] + num;
      }

      MArr[i] = (int) (sumArr[i] % M);
      CombArr[MArr[i]]++;
    }

    long cnt = CombArr[0];
    for (int i = 0; i < M; i++) {
      if (CombArr[i] > 1) {
        cnt += (long) CombArr[i] * (CombArr[i]-1) / 2;
      }
    }
    bw.write(cnt + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
