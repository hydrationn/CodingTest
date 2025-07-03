import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int input = Integer.parseInt(br.readLine());
    int N = input;
    int cnt = 0;

    while(true) {
      N = (N % 10 * 10) + ((N / 10 + N % 10) % 10);
      cnt ++;
      if(N == input) {
        break;
      }
    }
    br.close();

    bw.write(cnt + "\n");
    bw.flush();
    bw.close();
  }
}