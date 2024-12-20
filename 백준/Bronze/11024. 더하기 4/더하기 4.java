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
    StringTokenizer st;

    int T = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      
      int sum = 0;
      int cnt = st.countTokens();
      for (int j = 0; j < cnt; j++) {
        sum += Integer.parseInt(st.nextToken());
      }
      bw.write(sum + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
