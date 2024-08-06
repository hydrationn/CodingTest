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

    String N = String.valueOf(st.nextToken()); // 계산해야 할 값
    int B = Integer.parseInt(st.nextToken()); // 진법

    int sum = 0;
    int idx = 0;
    int num = 0;

    for(int i = N.length()-1 ; i >= 0; i--){
      char c = N.charAt(i);

      if ('0' <= c && c <= '9') {
        num = c - '0';
      } else {
        num = c - 'A' + 10;
      }
      sum += num * Math.pow(B, idx++);
    }
    bw.write(sum + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
