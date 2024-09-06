import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    List<String> testList = new ArrayList<>();
    List<String> totalList = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      testList.add(br.readLine());
    }

    for (int i = 0; i < M; i++) {
      totalList.add(br.readLine());
    }

    int count = 0;

    for (int i = 0; i < M; i++) {
      if (testList.contains(totalList.get(i))) {
        count++;
      }
    }

    bw.write(count + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}