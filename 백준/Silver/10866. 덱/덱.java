import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    Deque<Integer> intDeque = new LinkedList<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      String order = st.nextToken();
      int X;

      switch (order) {
        // push_front X: 정수 X를 덱의 앞에 넣는다.
        case "push_front":
          X = Integer.parseInt(st.nextToken());
          intDeque.offerFirst(X);
          break;

        // push_back X: 정수 X를 덱의 뒤에 넣는다.
        case "push_back":
          X = Integer.parseInt(st.nextToken());
          intDeque.offerLast(X);
          break;

        // pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "pop_front":
          if (intDeque.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(intDeque.pollFirst()).append("\n");
          break;

        // pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "pop_back":
          if (intDeque.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(intDeque.pollLast()).append("\n");
          break;

        // size: 덱에 들어있는 정수의 개수를 출력한다.
        case "size":
          sb.append(intDeque.size()).append("\n");
          break;

        // empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
        case "empty":
          if (intDeque.isEmpty())
            sb.append(1).append("\n");
          else
            sb.append(0).append("\n");
          break;
          
        // front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "front":
          if (intDeque.isEmpty())
            sb.append(-1).append("\n");
          else 
            sb.append(intDeque.peekFirst()).append("\n");
          break;
          
        // back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "back":
          if (intDeque.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(intDeque.peekLast()).append("\n");
          break;
      }
    }
    bw.write( sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
