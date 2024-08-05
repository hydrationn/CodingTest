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

    int x, y, z;

    String triangle;

    while (true) {
      st = new StringTokenizer(br.readLine());

      x = Integer.parseInt(st.nextToken());
      y = Integer.parseInt(st.nextToken());
      z = Integer.parseInt(st.nextToken());

      if (x == 0 && y == 0 && z == 0) {
        break;
      }

      int max = Math.max(x, Math.max(y, z));
      int sum = x + y + z - max;

      if (max >= sum) {
        triangle = "Invalid";
      } else {
        if (x == y && y == z) {
          triangle = "Equilateral";
        } else if (x == y || y == z || x == z) {
          triangle = "Isosceles";
        } else {
          triangle = "Scalene";
        }
      }

      sb.append(triangle).append("\n");
    }

    bw.write(sb.toString());
    br.close();

    bw.flush();
    bw.close();
  }
}
