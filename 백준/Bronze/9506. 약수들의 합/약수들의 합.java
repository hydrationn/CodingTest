import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      int n  = Integer.parseInt(br.readLine());
      if (n == -1) {
        break;
      }

      boolean[] booleans = new boolean[n+1];

      int sum = 0;
      for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
          booleans[i] = true;
        }
      }

      for (int i = 1; i < n; i++) {
        if (booleans[i] == true)
          sum += i;
      }

      if (n == sum) {
        bw.write(n + " = 1"); // 1은 모든 자연수의 약수에 해당되므로
        for (int i = 2; i < booleans.length-1; i++) {
          if (booleans[i] == true) {
            bw.write(" + " + i);
          }
        }
        bw.write("\n");
      } else {
        bw.write(n + " is NOT perfect." + "\n");
      }
    }
    br.close();

    bw.flush();
    bw.close();
  }
}
