import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static int[] dp;
  public static int N;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = Integer.parseInt(br.readLine());
    dp = new int[1000000 + 1];

    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 3;

    for (int i = 4; i < dp.length; i++) {
      dp[i] = -1;
    }

    bw.write(tile01(N) + "\n");

    br.close();
    bw.flush();
    bw.close();
  }

  // 01타일은 피보나치 수열과 같은 규칙을 가지고 있음.
  public static long tile01(int N) {
    if (dp[N] == -1)
      dp[N] = (int) ((tile01(N-2) + tile01(N-1)) % 15746);
    return dp[N];
  }
}
