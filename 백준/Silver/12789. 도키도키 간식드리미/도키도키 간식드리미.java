import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    Queue<Integer> recurrentQueue = new LinkedList<>();
    Stack<Integer> tempStack = new Stack<>();

    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      recurrentQueue.add(Integer.parseInt(st.nextToken()));
    }

    int turn = 1;

    // 블로그 참고 코드
    while(!recurrentQueue.isEmpty()) {	// 대기열에서 학생수가 없어질 때 까지
      if(recurrentQueue.peek() == turn) {	//간식먹는 순서라면
        recurrentQueue.poll();
        turn++;
      }else if(!tempStack.isEmpty() && tempStack.peek() == turn) {	// 스택도 대기열이므로 스택 검사도 해야 한다.
        tempStack.pop();
        turn++;
      }else {	// 큐 대기열에 있는 학생의 순서가 start와 동일하지 않으면
        tempStack.push(recurrentQueue.poll());	// 큐에서 빼서 스택에 집어넣는다.
      }
    }
    while(!tempStack.isEmpty()) {	// 스택에 학생 남아있다면 간식 순서로 나오는지 확인
      if(tempStack.peek() == turn) {	// 간식 순서 맞음
        tempStack.pop();
        turn++;
      }else {	// 간식 순서 틀림
        System.out.println("Sad");
        return;
      }
    }
    System.out.println("Nice");

    /*// 내가 짠 코드.. 나 참 당최 어디가 틀린 건지 모르겠네
    StringBuilder sb = new StringBuilder();
    while (true) {
      if (!recurrentQueue.isEmpty()) {
        if (recurrentQueue.peek() == turn) {
          recurrentQueue.remove();
          turn++;
        } else {
          if (tempStack.isEmpty()) {
            tempStack.add(recurrentQueue.remove());
          } else if (recurrentQueue.peek() < tempStack.peek()) {
            tempStack.add(recurrentQueue.remove());
          } else {
            sb.append("Sad\n");
            break;
          }
        }
      } else {
        while (!tempStack.isEmpty()) {
          if (tempStack.peek() == turn) {
            tempStack.pop();
            turn++;
          } else {
            sb.append("Sad\n");
            break;
          }
        }
      }

      if (recurrentQueue.isEmpty() && tempStack.isEmpty()) {
        sb.append("Nice\n");
        break;
      }
    }
    bw.write(sb.toString());

    br.close();

    bw.flush();
    bw.close();*/
  }
}