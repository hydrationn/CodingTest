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

    StringBuilder sentence = new StringBuilder();

    String str;
    while ((str = br.readLine()) != null) {
      sentence.append(str);
    }

    int sum = 0;
    StringTokenizer st = new StringTokenizer(sentence.toString(), ",");
    while (st.hasMoreTokens()) {
      sum += Integer.parseInt(st.nextToken());
    }

    bw.write(sum + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
