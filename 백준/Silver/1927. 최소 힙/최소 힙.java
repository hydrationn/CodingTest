import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());

      if (num == 0) {
        if (minHeap.isEmpty())
          sb.append(0).append("\n");
        else
          sb.append(minHeap.poll()).append("\n");
      } else {
        minHeap.offer(num);
      }
    }
    bw.write(sb.toString());
    br.close();

    bw.flush();
    bw.close();
  }
}