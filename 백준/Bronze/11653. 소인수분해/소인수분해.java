import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int n  = Integer.parseInt(br.readLine());

    for (int i = 2; i <= Math.sqrt(n); i++) {
      while (n % i == 0) {
        sb.append(i).append("\n");
        n /= i;
      }
    }

    if (n != 1)
      sb.append(n).append("\n");

    bw.write(String.valueOf(sb));
    br.close();

    bw.flush();
    bw.close();
  }
}
