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

    int K = Integer.parseInt(br.readLine());

    Stack<Integer> intStack = new Stack<>();

    for (int i = 0; i < K; i++) {
      int input = Integer.parseInt(br.readLine());

      if (input == 0) {
        intStack.pop();
      } else {
        intStack.push(input);
      }
    }

    int sum = 0;

    while (!intStack.isEmpty()) {
      sum += intStack.pop();
    }
    bw.write(sum + "\n");

    br.close();

    bw.flush();
    bw.close();
  }
}
