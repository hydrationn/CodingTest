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
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    Map<String, String> siteMap = new HashMap<>();
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      String address = st.nextToken();
      String pwd = st.nextToken();

      siteMap.put(address, pwd);
    }

    for (int i = 0; i < M; i++) {
      sb.append(siteMap.get(br.readLine())).append("\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
