import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static long[] seq = new long[101];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());

    seq[0] = 0;
    seq[1] = 1;
    seq[2] = 1;
    seq[3] = 1;

    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());

      sb.append(padovan(N)).append("\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }

  public static long padovan(int N) {
    if (seq[N] == 0)
      seq[N] = padovan(N-2) + padovan(N-3);

    return seq[N];
  }
}
