import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
  static int counting1 = 0;
  static int counting2 = 0;
  static int[] f;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    f = new int[N];

    fib(N);
    fibonacci(N);

    bw.write(counting1 + " " + counting2 + "\n");

    br.close();

    bw.flush();
    bw.close();
  }

  // 피보나치 by 재귀 호출
  public static int fib(int N) {
    if (N==1 || N==2) {
      counting1++;
      return 1;
    }
    return fib(N-1) + fib(N-2);
  }

  // 피보나치 by 동적 프로그래밍
  public static int fibonacci(int N) {
    f[0] = f[1] = 1;

    for (int i = 2; i < N; i++) {
      counting2++;
      f[i] = f[i-1] + f[i-2];
    }

    return f[N-1];
  }
}