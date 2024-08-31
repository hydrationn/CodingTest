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

    bw.write(finbonacci(N) +"\n");

    br.close();
    bw.flush();
    bw.close();
  }

  public static long finbonacci(int N) {
    if (N == 0) {
      return 0;
    } else if (N == 1) {
      return 1;
    } else {
      return finbonacci(N-1) + finbonacci(N-2);
    }
  }
}
