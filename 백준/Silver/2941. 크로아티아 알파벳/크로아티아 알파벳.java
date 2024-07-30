import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine().toString();

    int cnt = 0;
    int i = 0;

    while (i < str.length()) {
      char c = str.charAt(i);

      if (c == 'c' && i + 1 < str.length()) {
        if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
          i += 2;
          cnt++;
          continue;
        }
      } else if (c == 'd' && i + 1 < str.length()) {
        if (str.charAt(i + 1) == 'z' && i + 2 < str.length() && str.charAt(i + 2) == '=') {
          i += 3;
          cnt++;
          continue;
        } else if (str.charAt(i + 1) == '-') {
          i += 2;
          cnt++;
          continue;
        }
      } else if ((c == 'l' || c == 'n') && i + 1 < str.length()) {
        if (str.charAt(i + 1) == 'j') {
          i += 2;
          cnt++;
          continue;
        }
      } else if ((c == 's' || c == 'z') && i + 1 < str.length()) {
        if (str.charAt(i + 1) == '=') {
          i += 2;
          cnt++;
          continue;
        }
      }
      i++;
      cnt++;
    }
    br.close();

    bw.write(cnt + "\n");
    bw.flush();
    bw.close();
  }
}
