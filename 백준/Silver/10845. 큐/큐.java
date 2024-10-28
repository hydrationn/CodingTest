import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    Queue<Integer> intQueue = new LinkedList<>();

    int N = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      String order = st.nextToken();

      switch (order) {
        // push X: 정수 X를 큐에 넣는 연산이다.
        case "push":
          int x = Integer.parseInt(st.nextToken());
          intQueue.add(x);
          break;

        // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "pop":
          if (intQueue.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(intQueue.poll()).append("\n");
          break;

        // size: 큐에 들어있는 정수의 개수를 출력한다.
        case "size":
          sb.append(intQueue.size()).append("\n");
          break;

        // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        case "empty":
          if (intQueue.isEmpty())
            sb.append(1).append("\n");
          else
            sb.append(0).append("\n");
          break;

        // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "front":
          if (intQueue.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(intQueue.peek()).append("\n");
          break;

        // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "back":
          if (intQueue.isEmpty()) {
            sb.append(-1).append("\n");
          } else {
            for (int j = 0; j <= intQueue.size()-2; j++) {
              intQueue.add(intQueue.remove());
            }
            sb.append(intQueue.peek()).append("\n");
            intQueue.add(intQueue.remove());
          }
          break;
      }
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
