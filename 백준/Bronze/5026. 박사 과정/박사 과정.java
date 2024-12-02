import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    List<String> answer = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      String question = br.readLine();

      if (question.equals("P=NP")) {
        answer.add("skipped");
      } else {
        st = new StringTokenizer(question);
        int A = Integer.parseInt(st.nextToken("+"));
        int B = Integer.parseInt(st.nextToken("+"));
        
        int result = A + B;

        if (answer.contains(result)) {
          continue;
        }
        answer.add(String.valueOf(result));
      }
    }

    // 출력
    for (String element : answer) {
      sb.append(element + "\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
