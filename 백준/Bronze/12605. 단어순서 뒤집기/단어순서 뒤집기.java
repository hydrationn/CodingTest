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
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    Stack<String> strStack = new Stack<>();

    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());

      int length = st.countTokens();
      for (int j = 0; j < length; j++) {
        strStack.push(st.nextToken());
      }

      sb.append("Case #").append(i).append(": ");
      while (!strStack.isEmpty()) {
        sb.append(strStack.pop()).append(" ");
      }
      sb.append("\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
