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

    int N = Integer.parseInt(br.readLine());

    Set<String> gomgomSet = new HashSet<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      String A = st.nextToken();
      String B = st.nextToken();

      if (A.equals("ChongChong") || B.equals("ChongChong")) {
        gomgomSet.add(A);
        gomgomSet.add(B);
      } else if (gomgomSet.contains(A)) {
        gomgomSet.add(B);
      } else if (gomgomSet.contains(B)) {
        gomgomSet.add(A);
      }
    }
    bw.write(gomgomSet.size() + "\n");

    br.close();

    bw.flush();
    bw.close();
  }
}
