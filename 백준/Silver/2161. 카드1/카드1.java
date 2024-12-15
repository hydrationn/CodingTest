import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Queue<Integer> intQueue = new LinkedList<>();

    int N = Integer.parseInt(br.readLine());
    for (int i = 1; i <= N; i++) {
      intQueue.add(i);
    }

    while (intQueue.size() > 1) {
      // 우선, 제일 위에 있는 카드를 바닥에 버린다.
      bw.write(intQueue.poll() + " ");

      // 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
      intQueue.add(intQueue.poll());
    }
    // 마지막 남은 카드 출력
    bw.write(intQueue.poll() + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
