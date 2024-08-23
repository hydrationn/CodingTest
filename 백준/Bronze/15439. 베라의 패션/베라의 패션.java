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

    bw.write(styling(N) + "\n");
    br.close();
    bw.flush();
    bw.close();
  }

  public static int styling(int N) {
    if (N == 1) {
      return 0;
    } else {
      return N * (N-1);
    }
  }
}
