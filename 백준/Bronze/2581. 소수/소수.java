import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int m  = Integer.parseInt(br.readLine());
    int n  = Integer.parseInt(br.readLine());

    int sum = 0;
    int min = Integer.MAX_VALUE;

    for (int i = m; i <= n; i++) {
      boolean isPrimeNumber = true;

      if (i == 1) {
        isPrimeNumber = false;
      }

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrimeNumber = false;
        }
      }

      if (isPrimeNumber) {
        sum += i;

        if (min > i)
          min = i;
      }
    }

    if (sum == 0) {
      bw.write(-1 + "\n");
    } else {
      bw.write(sum + "\n");
      bw.write(min + "\n");
    }

    br.close();

    bw.flush();
    bw.close();
  }
}
