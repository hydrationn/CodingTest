import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());

    Map<String, String> wordMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), "=");

      String input = st.nextToken().trim(); // .trim()을 통한 공백 제거
      String replace = st.nextToken().trim();
      wordMap.put(input, replace);
    }

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int K = Integer.parseInt(br.readLine());
      
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < K; j++) {
        String word = st.nextToken();

        sb.append(wordMap.get(word)).append(" ");
      }
      sb.append("\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
