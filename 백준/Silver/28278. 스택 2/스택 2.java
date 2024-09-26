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
    Stack<Integer> listStack = new Stack<>();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      int order = Integer.parseInt(st.nextToken());

      // 1 X : 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
      if (order == 1) {
        int n = Integer.parseInt(st.nextToken());

        listStack.push(n);
      }
      // 2 : 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
      else if (order == 2) {
        if (!listStack.isEmpty()) {
          sb.append(listStack.pop()).append("\n");
        } else {
          sb.append(-1).append("\n");
        }
      }
      // 3 : 스택에 들어있는 정수의 개수를 출력한다.
      else if (order == 3) {
        sb.append(listStack.size()).append("\n");
      }
      // 4 : 스택이 비어있으면 1, 아니면 0을 출력한다.
      else if (order == 4) {
        if (listStack.isEmpty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0). append("\n");
        }
      }
      // 5 : 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
      else {
        if (!listStack.isEmpty()) {
          sb.append(listStack.peek()).append("\n");
        } else {
          sb.append(-1).append("\n");
        }
      }
    }
    bw.write(sb.toString());

    br.close();

    bw.flush();
    bw.close();
  }
}