import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    /** BigInteger: 자바 자료형의 기본형 중 정수형(byte, short, int, long) 보다 큰 범위의 정수를 다루고 싶을 때 사용하는 클래스
     *            -> java.Math.BigInteger에 존재
     *            -> 문자열을 인자로 넘겨줘야 하고, 내부에 int[] 배열로 데이터를 저장한다.
    **/
    BigInteger A = new BigInteger(st.nextToken());
    BigInteger B = new BigInteger(st.nextToken());

    BigInteger result = A.add(B);

    bw.write(result + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
