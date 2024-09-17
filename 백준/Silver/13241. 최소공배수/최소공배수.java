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

    long A = Integer.parseInt(st.nextToken());
    long B = Integer.parseInt(st.nextToken());

    // 유클리드 호제법 : 2개 수의 최대공약수를 구하는 알고리즘
    //              -> 자연수 A, B에 대해서 A를 B로 나눈 나머지를 R이라 하면, A, B의 최대공약수와 B, R의 최대공약수는 같다.
    //              -> 이 성질에 따라 A를 B로 나눈 나머지 R을 구하고, B를 R로 나눈 나머지 r'을 구한다.
    //              -> 나머지가 0이 될 때 나눈 수가 A, B의 최대공약수가 된다.

    long gcd = getGCD(A, B);

    // 최소공배수 = A * B / (최대공약수)
    bw.write(A * B / gcd + "\n");

    br.close();

    bw.flush();
    bw.close();
  }

  public static long getGCD(long A, long B) {
    if (A % B == 0) {
      return B;
    }
    return getGCD(B, A%B);
  }
}
