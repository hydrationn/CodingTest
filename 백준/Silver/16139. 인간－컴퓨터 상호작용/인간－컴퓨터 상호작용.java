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

    String string = br.readLine();

    int q = Integer.parseInt(br.readLine());

    int cnt;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < q; i++) {
      st = new StringTokenizer(br.readLine());

      cnt = 0;

      String alpha = st.nextToken();
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      for (int j = start; j <= end; j++) {
        if (String.valueOf(string.charAt(j)).equals(alpha)) {
          cnt++;
        }
      }
      sb.append(cnt).append("\n");
    }
    bw.write(sb.toString());

    br.close();

    bw.flush();
    bw.close();
  }
}
