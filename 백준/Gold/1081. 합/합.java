import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {

  // 자릿수 합을 1부터 n까지 누적해서 계산
  static long sumOfDigits(long n) {
    long res = 0;
    long factor = 1;

    while (n / factor > 0) {
      long lower = n % factor;
      long current = (n / factor) % 10;
      long higher = n / (factor * 10);

      // 현재 자릿수에 대해 누적 자릿수 합 계산
      for (int d = 1; d <= 9; d++) {
        if (d < current) {
          res += (higher + 1) * d * factor;
        } else if (d == current) {
          res += higher * d * factor + d * (lower + 1);
        } else {
          res += higher * d * factor;
        }
      }

      factor *= 10;
    }

    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long L = Long.parseLong(st.nextToken());
    long U = Long.parseLong(st.nextToken());

    long result = sumOfDigits(U) - sumOfDigits(L - 1);
    System.out.println(result);
  }
}