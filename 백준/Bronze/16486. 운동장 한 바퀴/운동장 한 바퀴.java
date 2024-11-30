import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int d1 = Integer.parseInt(br.readLine()); // 영역 C의 가로 길이
    int d2 = Integer.parseInt(br.readLine()); // 영역 A의 반지름의 길이

    System.out.printf("%.6f", d1*2 + d2*2*Math.PI);
    br.close();
    bw.flush();
    bw.close();
  }
}
