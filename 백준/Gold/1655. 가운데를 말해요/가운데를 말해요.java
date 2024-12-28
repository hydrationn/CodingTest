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

    int n = Integer.parseInt(br.readLine());

    // 최대 힙 (중간값 이하)
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    // 최소 힙 (중간값 이상)
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());

      // 1. 최대 힙에 삽입
      if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
        maxHeap.offer(num);
      } else {
        minHeap.offer(num);
      }

      // 2. 힙 크기 조정
      if (maxHeap.size() > minHeap.size() + 1) {
        minHeap.offer(maxHeap.poll());
      } else if (minHeap.size() > maxHeap.size()) {
        maxHeap.offer(minHeap.poll());
      }

      // 3. 중간값 출력 (최대 힙의 루트)
      sb.append(maxHeap.peek()).append("\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
