import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    Set<Long> sangSet;

    while (true) {
      st = new StringTokenizer(br.readLine());
      long sangCnt = Long.parseLong(st.nextToken());
      long sunCnt = Long.parseLong(st.nextToken());

      if (sangCnt == 0 &&  sunCnt == 0)
        break;

      sangSet = new HashSet<>();

      for (int i = 0; i < sangCnt; i++) {
        long sangNum = Long.parseLong(br.readLine());
        sangSet.add(sangNum);
      }

      int cnt = 0;
      for (int i = 0; i < sunCnt; i++) {
        long sunNum = Long.parseLong(br.readLine());
        if (sangSet.contains(sunNum))
          cnt++;
      }

      bw.write(cnt + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}