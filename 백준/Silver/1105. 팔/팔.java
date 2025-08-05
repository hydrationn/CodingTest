import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String L = st.nextToken();
    String R = st.nextToken();

    int result = 0;

    if (L.length() == R.length()) {
      for (int i = 0; i < L.length(); i++) {
        if (L.charAt(i) != R.charAt(i))
          break;
        
        if (L.charAt(i) == '8')
          result++;
      }
    }

    bw.write(result + "\n");

    bw.flush();
    bw.close();
  }
}