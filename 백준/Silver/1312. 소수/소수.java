import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    A %= B;
    int digit = 0;

    for (int i = 0; i < N; i++) {
      A *= 10;
      // i+1번째 소수 자리
      digit = A / B;
      A %= B;
    }

    bw.write(digit + "\n");
    bw.flush();
    bw.close();
  }
}