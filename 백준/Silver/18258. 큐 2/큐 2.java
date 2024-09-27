import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    Deque<Integer> deque = new ArrayDeque<>();

    int N = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      String order = st.nextToken();

      // 1. push X: 정수 X를 큐에 넣는 연산이다.
      if (order.equals("push")) {
        deque.add(Integer.parseInt(st.nextToken()));
      }
      // 2. pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
      else if (order.equals("pop")) {
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(deque.remove()).append("\n");
        }
      }
      // 3. size: 큐에 들어있는 정수의 개수를 출력한다.
      else if (order.equals("size")) {
        sb.append(deque.size()).append("\n");
      }
      // 4. empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
      else if (order.equals("empty")) {
        if (deque.isEmpty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0).append("\n");
        }
      }
      // 5. front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
      else if (order.equals("front")) {
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(deque.peek()).append("\n");
        }
      }
      // 6. back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
      else if (order.equals("back")) {
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(deque.getLast()).append("\n");
        }
      }
    }
    bw.write(sb.toString());

    br.close();

    bw.flush();
    bw.close();
  }
}