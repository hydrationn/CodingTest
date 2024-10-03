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

    String line;
    while (true) {
      line = br.readLine();

      if (line.equals("."))
        break;

      bw.write(balance(line));
    }

    br.close();
    bw.flush();
    bw.close();
  }

  public static String balance(String line) {
    Stack<Character> strStack = new Stack<>();
    char token;

    for (int i = 0; i < line.length(); i++) {
      token = line.charAt(i);

      if (token == '(' || token == '[') {
        strStack.push(token);
      }
      else if (token == ')') {
        if (strStack.isEmpty()) {
          return "no\n";
        } else {
          if (strStack.peek() == '(') {
            strStack.pop();
          } else {
            return "no\n";
          }
        }
      } else if (token == ']') {
        if (strStack.isEmpty()) {
          return "no\n";
        } else {
          if (strStack.peek() == '[') {
            strStack.pop();
          } else {
            return "no\n";
          }
        }
      }
    }

    if (strStack.isEmpty())
      return "yes\n";
    else
      return "no\n";
  }
}