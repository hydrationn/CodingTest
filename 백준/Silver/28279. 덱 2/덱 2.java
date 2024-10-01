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
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    Deque<Integer> intDeque = new LinkedList<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      int order = Integer.parseInt(st.nextToken());

      switch (order) {
        //  1. 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
        case 1:
          int frontInput = Integer.parseInt(st.nextToken());
          intDeque.addFirst(frontInput);
          break;

        // 2. 2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
        case 2:
          int backInput = Integer.parseInt(st.nextToken());
          intDeque.addLast(backInput);
          break;

        // 3. 3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
        case 3:
          if (!intDeque.isEmpty())
            sb.append(intDeque.pollFirst()).append("\n");
          else
            sb.append(-1).append("\n");
          break;

        // 4. 4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
        case 4:
          if (!intDeque.isEmpty())
            sb.append(intDeque.pollLast()).append("\n");
          else
            sb.append(-1).append("\n");
          break;

        // 5: 덱에 들어있는 정수의 개수를 출력한다.
        case 5:
          sb.append(intDeque.size()).append("\n");
          break;

        // 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
        case 6:
          if (intDeque.isEmpty())
            sb.append(1).append("\n");
          else
            sb.append(0).append("\n");
          break;

        // 7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
        case 7:
          if (!intDeque.isEmpty())
            sb.append(intDeque.peekFirst()).append("\n");
          else
            sb.append(-1).append("\n");
          break;

        // 8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
        case 8:
          if (!intDeque.isEmpty())
            sb.append(intDeque.peekLast()).append("\n");
          else
            sb.append(-1).append("\n");
          break;
      }
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}