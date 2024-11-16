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
    StringTokenizer st = new StringTokenizer(br.readLine());

    Deque<Integer> intDeque = new ArrayDeque<>();

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= N; i++) {
      intDeque.add(i);
    }

    while (intDeque.size() >= K) {
      intDeque.addLast(intDeque.pollFirst());
      for (int i = 1; i < K; i++) {
        intDeque.pollFirst();
      }
    }
    bw.write(intDeque.getFirst() + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
