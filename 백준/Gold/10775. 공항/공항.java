import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int G = Integer.parseInt(br.readLine());
    int P = Integer.parseInt(br.readLine());

    int[] parent = new int[G + 1];
    for (int i = 0; i <= G; i++) parent[i] = i;

    int docking = 0;

    for (int i = 0; i < P; i++) {
      int g = Integer.parseInt(br.readLine());

      // 반복문으로 경로 압축
      int x = g;
      while (x != parent[x]) {
        parent[x] = parent[parent[x]];
        x = parent[x];
      }
      int gate = x;

      if (gate == 0) break;

      docking++;

      // union(gate, gate-1) = parent[gate] = find(gate-1)
      x = gate - 1;
      while (x != parent[x]) {
        parent[x] = parent[parent[x]];
        x = parent[x];
      }
      parent[gate] = x;
    }

    sb.append(docking).append("\n");
    bw.write(sb.toString());

    bw.flush();
    bw.close();
  }
}