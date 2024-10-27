import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    Stack<Integer> intStack = new Stack<>();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String order = st.nextToken();
      int num;

      switch (order) {
        // push X: 정수 X를 스택에 넣는 연산이다.
        case "push":
          num = Integer.parseInt(st.nextToken());
          intStack.push(num);
          break;

        // pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "pop":
          if (intStack.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(intStack.pop()).append("\n");
          break;

        // size: 스택에 들어있는 정수의 개수를 출력한다.
        case "size":
          sb.append(intStack.size()).append("\n");
          break;

        // empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        case "empty":
          if (intStack.isEmpty())
            sb.append(1).append("\n");
          else
            sb.append(0).append("\n");
          break;

        // top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        case "top":
          if (intStack.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(intStack.peek()).append("\n");
          break;
      }
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
