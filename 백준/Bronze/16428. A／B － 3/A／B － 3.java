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

    long A = Long.parseLong(st.nextToken());
    long B = Long.parseLong(st.nextToken());

    long quotient = A / B;
    long remainder = A % B;

    // 나머지 조건 조정
    if (remainder < 0) {
      if (B > 0) {
        remainder += B;
        quotient -= 1;
      } else {
        remainder -= B;
        quotient += 1;
      }
    }

    bw.write(quotient + " " + remainder + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}