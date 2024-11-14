import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> intQueue = new PriorityQueue<>();

    for (int i = 0; i < N; i++) {
      intQueue.add(Integer.parseInt(br.readLine()));
    }

    int sum = 0;
    while (intQueue.size() > 1) {
      int poll1 = intQueue.poll();
      int poll2 = intQueue.poll();
      sum += poll1 + poll2;
      intQueue.add(poll1 + poll2);
    }
    System.out.println(sum);
    br.close();
  }
}
