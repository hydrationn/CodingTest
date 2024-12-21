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

    int A = Integer.parseInt(st.nextToken()); // 고정 비용
    int B = Integer.parseInt(st.nextToken()); // 가변 비용
    int C = Integer.parseInt(st.nextToken()); // 노트북 가격

    // nC = A + nB
    // nC - nB = A
    // n(C - B) = A
    // n = A / (C-B) -> 총 비용과 총 수익이 같아지는 지점
    if (C <= B)
      bw.write(-1 + "\n");
    else
      bw.write(A/(C-B)+1 + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
