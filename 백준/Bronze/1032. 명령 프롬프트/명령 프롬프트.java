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
    StringBuilder sb = new StringBuilder();
    
    int N = Integer.parseInt(st.nextToken());

    String template = br.readLine();
    String[] nArr = template.split("");
    boolean[] nBoolean = new boolean[nArr.length];

    for (int i = 0; i < N-1; i++) {
      template = br.readLine();

      for (int j = 0; j < nArr.length; j++) {
        if (!nArr[j].equals(String.valueOf(template.charAt(j)))) {
          nBoolean[j] = true;
        }
      }
    }

    for (int i = 0; i < nBoolean.length; i++) {
      if (nBoolean[i]) {
        sb.append("?");
      } else {
        sb.append(nArr[i]);
      }
    }
    sb.append("\n");

    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}