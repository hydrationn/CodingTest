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
    StringTokenizer st = new StringTokenizer(br.readLine(), "-");
    StringBuilder sb = new StringBuilder();

    sb.append(st.nextToken().charAt(0));
    while (st.hasMoreElements()) {
      sb.append(st.nextToken().charAt(0));
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
