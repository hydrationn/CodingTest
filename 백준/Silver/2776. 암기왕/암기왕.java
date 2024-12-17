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

    int T = Integer.parseInt(br.readLine());

    for (int t = 0; t < T; t++) {
      int N = Integer.parseInt(br.readLine());
      Set<Integer> intSet = new HashSet<>();

      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < N; i++) {
        intSet.add(Integer.parseInt(st.nextToken()));
      }

      int M = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        int num = Integer.parseInt(st.nextToken());
        if (intSet.contains(num)) {
          bw.write(1 + "\n");
        } else {
          bw.write(0 + "\n");
        }
      }
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
