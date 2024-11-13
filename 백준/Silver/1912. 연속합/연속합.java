import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static int N;
  public static int maxSum;
  public static int[] intArr;
  public static Integer[] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    N = Integer.parseInt(br.readLine());
    intArr = new int[N];
    dp = new Integer[N];

    maxSum = Integer.MIN_VALUE;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      intArr[i] = Integer.parseInt(st.nextToken());
    }

    dp[0] = intArr[0];
    maxSum = intArr[0];

    sum(N-1);

    bw.write(maxSum + "\n");

    br.close();
    bw.flush();
    bw.close();
  }

  public static int sum(int num) {
    if (dp[num] == null) {
      dp[num] = Math.max(sum(num - 1) + intArr[num], intArr[num]);
      maxSum = Math.max(maxSum, dp[num]);
    }
    return dp[num];
  }
}
