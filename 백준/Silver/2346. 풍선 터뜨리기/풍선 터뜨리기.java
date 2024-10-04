import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    Deque<Balloon> balloonDeque = new ArrayDeque<>();

    int N = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int index;
    int value;

    for (int i = 1; i <= N; i++) {
      index = i;
      value = Integer.parseInt(st.nextToken());

      balloonDeque.add(new Balloon(index, value));
    }

    // 먼저, 1번 풍선 터뜨리기
    int next = balloonDeque.peekFirst().value;
    sb.append(balloonDeque.pollFirst().index + " ");

    while (!balloonDeque.isEmpty()) {
      if (next > 0) {
        for (int i = 0; i < next-1; i++) {
          balloonDeque.addLast(balloonDeque.pollFirst());
        }
      } else {
        for (int i = 0; i < -next; i++) {
          balloonDeque.addFirst(balloonDeque.pollLast());
        }
      }
      next = balloonDeque.peekFirst().value;
      sb.append(balloonDeque.pollFirst().index + " ");
    }
    bw.write(sb.toString());
    
    br.close();
    bw.flush();
    bw.close();
  }
}

class Balloon {
  int index;
  int value;

  public Balloon(int index, int value) {
    this.index = index;
    this.value = value;
  }
}