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
    int cnt = 0;

    for (int i = 0; i < N; i++) {
      String word = br.readLine();

      Stack<String> wordStack = new Stack<>();

      int length = word.length();

      wordStack.add(String.valueOf(word.charAt(0)));
      for (int j = 1; j < length; j++) {
        String input = String.valueOf(word.charAt(j));

        if (!wordStack.isEmpty() && wordStack.peek().equals(input))
            wordStack.pop();
        else
          wordStack.push(input);
      }
      if (wordStack.isEmpty())
        cnt++;
    }
    bw.write(cnt + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
