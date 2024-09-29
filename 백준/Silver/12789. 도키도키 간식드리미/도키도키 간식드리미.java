import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    Queue<Integer> recurrentQueue = new LinkedList<>();
    Stack<Integer> tempStack = new Stack<>();

    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      recurrentQueue.add(Integer.parseInt(st.nextToken()));
    }

    int turn = 1;

    while (!recurrentQueue.isEmpty()) {
      if (recurrentQueue.peek() == turn) {
        recurrentQueue.poll();
        turn++;
      } else if(!tempStack.isEmpty() && tempStack.peek() == turn) {
        tempStack.pop();
        turn++;
      } else {
        tempStack.push(recurrentQueue.poll());
      }
    }
    while (!tempStack.isEmpty()) {
      if (tempStack.peek() == turn) {
        tempStack.pop();
        turn++;
      } else {
        System.out.println("Sad");
        return;
      }
    }
    System.out.println("Nice");

    br.close();
  }
}