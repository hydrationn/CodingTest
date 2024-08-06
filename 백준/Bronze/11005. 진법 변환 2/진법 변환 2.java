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
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(st.nextToken()); // 계산해야 할 값
    int B = Integer.parseInt(st.nextToken()); // 진법

    while (N > 0) {
      int num = N % B;
      if (num < 10) {
        sb.append(num);
      } else {
        sb.append((char) (num + 'A' - 10));
      }
      N /= B;
    }
    bw.write(sb.reverse() + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
