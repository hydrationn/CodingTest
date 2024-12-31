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
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    while (true) {
      int N = Integer.parseInt(br.readLine());

      if (N == 0)
        break;

      double maxHeight = 0;
      for (int i = 0; i < N; i++) {
        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        double height = Double.parseDouble(st.nextToken());

        if (maxHeight < height){
          sb = new StringBuilder();
          sb.append(name).append(" ");
          maxHeight = height;
        } else if (maxHeight == height) {
          sb.append(name).append(" ");
        }
      }
      sb.append("\n");
      bw.write(sb.toString());
    }
    br.close();
    bw.flush();
    bw.close();
  }
}