import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    br.close();

    bw.write(factorial(N) + "\n");
    bw.flush();
    bw.close();
  }

  public static int factorial(int N) {
    if (N == 0) {
      return 1;
    } else {
      return N * factorial(N-1);
    }
  }
}
