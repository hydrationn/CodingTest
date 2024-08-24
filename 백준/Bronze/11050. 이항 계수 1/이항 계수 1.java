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
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    bw.write(binomialCoefficient(N, K) + "\n");

    br.close();
    bw.flush();
    br.close();
  }

  public static int binomialCoefficient(int N, int K) {
    return factorial(N) / factorial(N-K) / factorial(K);
  }

  public static int factorial(int N) {
    if (N == 0) {
      return 1;
    } else {
      return N *  factorial(N-1);
    }
  }
}
