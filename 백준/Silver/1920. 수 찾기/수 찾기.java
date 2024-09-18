import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
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

    Set<Integer> intSet = new HashSet<>();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {

      intSet.add(Integer.parseInt(st.nextToken()));
    }

    int M = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {

      if (intSet.contains(Integer.parseInt(st.nextToken()))) {
        bw.write(1 + "\n");
      } else {
        bw.write(0 + "\n");
      }
    }
    br.close();

    bw.flush();
    bw.close();
  }
}