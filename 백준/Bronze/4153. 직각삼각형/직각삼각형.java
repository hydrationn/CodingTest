import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    List<Integer> triangle;

    while (true) {
      triangle = new ArrayList<>();

      st = new StringTokenizer(br.readLine());

      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      if (A == 0 && B == 0 && C == 0)
        break;

      triangle.add(A);
      triangle.add(B);
      triangle.add(C);
      
      Collections.sort(triangle);

      if (Math.pow(triangle.get(2), 2) == Math.pow(triangle.get(0), 2) + Math.pow(triangle.get(1), 2))
        sb.append("right").append("\n");
      else
        sb.append("wrong").append("\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
