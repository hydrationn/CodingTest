import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());

    List<String> materials = new LinkedList<>();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      materials.add(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N-1; i++) {
      materials.remove(st.nextToken());
    }

    // 빠진 재료
    bw.write(materials.get(0) + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}