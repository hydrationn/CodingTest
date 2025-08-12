import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int K = Integer.parseInt(br.readLine());

      PriorityQueue<Long> pq = new PriorityQueue<>();
      int read = 0;
      StringTokenizer st = null;
      while (read < K) {
        if (st == null || !st.hasMoreTokens()) {
          st = new StringTokenizer(br.readLine());
        }
        while (st.hasMoreTokens() && read < K) {
          pq.add(Long.parseLong(st.nextToken()));
          read++;
        }
      }

      long cost = 0L;
      while (pq.size() > 1) {
        long a = pq.poll();
        long b = pq.poll();
        long sum = a + b;
        cost += sum;
        pq.add(sum);
      }
      sb.append(cost).append("\n");
    }
    bw.write(sb.toString());

    bw.flush();
    bw.close();
  }
}