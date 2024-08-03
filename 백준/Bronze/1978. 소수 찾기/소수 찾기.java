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

    int n  = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      int primeNumber = Integer.parseInt(st.nextToken());

      boolean isPrimeNumber = true;
      if (primeNumber == 1) {
        isPrimeNumber = false;
      }

      for (int j = 2; j < primeNumber; j++) {
        if (primeNumber % j == 0) {
          isPrimeNumber = false;
        }
      }

      if (isPrimeNumber)
        cnt++;
    }
    bw.write(cnt + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
