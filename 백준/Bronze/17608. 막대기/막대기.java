import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    Stack<Integer> stickStack = new Stack<>();

    for (int i = 0; i < N; i++) {
      int h = Integer.parseInt(br.readLine());
      stickStack.push(h);
    }

    int cnt = 1; // 가장 마지막에 넣은 막대기(rod)는 이미 보이므로 1부터 시작
    int lastStick = stickStack.pop();

    while (!stickStack.isEmpty()) {
      int currentStick = stickStack.pop();
      if (lastStick < currentStick) {
        cnt++;
        lastStick = currentStick;
      }
    }
    bw.write(cnt + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
