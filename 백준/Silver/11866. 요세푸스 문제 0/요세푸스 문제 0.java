import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    bw.write(josephus(N, K));

    br.close();
    bw.flush();
    bw.close();
  }

  public static String josephus(int N, int K) {
    StringBuilder sb = new StringBuilder();
    sb.append("<");

    Queue<Integer> intQueue = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      intQueue.add(i);
    }

    int cnt = 0;
    while (intQueue.size() > 1) {
      cnt++;
      if (cnt == K) {
        sb.append(intQueue.poll()).append(", ");
        cnt = 0;
      } else {
        intQueue.add(intQueue.poll());
      }
    }
    sb.append(intQueue.poll() + "");
    sb.append(">");

    return sb.toString();
  }
}