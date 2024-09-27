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

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      sb.append(parenthesisString(br.readLine()));
    }
    bw.write(sb.toString());

    br.close();

    bw.flush();
    bw.close();
  }

  public static String parenthesisString(String line) {

    Stack<String> listStack = new Stack<>();
    String parenthesis;

    for (int j = 0; j < line.length(); j++) {
      parenthesis = String.valueOf(line.charAt(j));

      if (parenthesis.equals("(")) {
        listStack.push("(");
      } else {
        if (listStack.isEmpty()) {
          return "NO\n";
        } else {
          if (listStack.peek().equals("(")) {
            listStack.pop();
          } else {
            return "NO\n";
          }
        }
      }

    }

    if (listStack.isEmpty()) {
      return "YES\n";
    } else {
      return "NO\n";
    }
  }
}