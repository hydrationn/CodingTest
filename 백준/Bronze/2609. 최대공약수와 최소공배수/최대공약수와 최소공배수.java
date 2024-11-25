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

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int gcd = gcd(A, B); // 최대공약수
    int gcf = A * B / gcd; // 최소공배수 = A/gcd * B/gcd * gcd

    bw.write(gcd + "\n");
    bw.write(gcf + "\n");

    br.close();
    bw.flush();
    bw.close();
  }

  // 유클리드 호제법
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
