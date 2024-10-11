import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> absMinHeap = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        if (Math.abs(o1) == Math.abs(o2))
          return o1 - o2;
        else return Math.abs(o1) - Math.abs(o2);
      }
    });

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());

      if (num == 0) {
        if (absMinHeap.isEmpty())
          sb.append(0).append("\n");
        else {
          sb.append(absMinHeap.poll()).append("\n");
        }
      } else {
        absMinHeap.offer(num);
      }
    }
    bw.write(sb.toString());
    br.close();

    bw.flush();
    bw.close();
  }
}