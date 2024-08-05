import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int z = Integer.parseInt(br.readLine());
    
    String triangle = null;

    if (x + y + z == 180) {
      if (x == 60 && y == 60 && z == 60) {
        triangle = "Equilateral";

      } else if (x == y || y == z || x == z) {
        triangle = "Isosceles";
      } else if (x != y && y != z && x != z) {
        triangle = "Scalene";
      }
    } else {
      triangle = "Error";
    }

    bw.write(triangle + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
