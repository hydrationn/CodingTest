import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    String sentence = "";
    while (st.hasMoreTokens()) {
      String word = st.nextToken();

      if (word.equals("What")) {
        sentence += "Forty-two ";
      } else if (word.contains("?")) {
        for (int i = 0; i < word.length()-1; i++) {
          sentence += word.charAt(i);
        }
        sentence += ".\n";
        sb.append(sentence);
        sentence = "";
      } else if (word.contains(".")) {
        sentence = "";
      } else {
        sentence += word + " ";
      }
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
