import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    while (true) {
      int N = Integer.parseInt(br.readLine());

      if (N == 0) {
        break;
      }

      int cnt = 0;
      boolean primeNumber;

      for (int i = N+1; i <= 2*N; i++) {
        primeNumber = true;

        if (i == 1) {
          primeNumber = false;
        } else {
          for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
              primeNumber = false;
              break;
            }
          }
        }

        if (primeNumber) {
          cnt++;
        }
      }
      System.out.println(cnt);
    }
  }
}