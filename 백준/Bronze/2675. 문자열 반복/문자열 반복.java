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

    StringTokenizer st;
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      String[] arr = st.nextToken().split("");

      for (int j = 0; j < arr.length; j++) {
        for (int k = 0; k < n; k++) {
          bw.write(arr[j]);
        }
      }
      bw.write("\n");
    }
    bw.write("\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
