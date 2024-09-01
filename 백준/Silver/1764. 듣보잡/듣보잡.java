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
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    Set<String> hearSet = new HashSet<>();
    Set<String> hearSeeSet = new HashSet<>();

    for (int i = 0; i < N; i++) {
      hearSet.add(br.readLine());
    }

    for (int i = 0; i < M; i++) {
      String name = br.readLine();
      if (hearSet.contains(name)) {
        hearSeeSet.add(name);
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(hearSeeSet.size()).append("\n");
    hearSeeSet.stream().sorted().forEach(name -> sb.append(name).append("\n"));

    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}