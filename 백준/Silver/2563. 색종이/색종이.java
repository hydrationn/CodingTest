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

    int n  = Integer.parseInt(br.readLine());
    boolean[][] booleans = new boolean[100][100];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      for (int j = a-1; j < a+10-1; j++) {
        for (int k = b-1; k < b+10-1; k++) {
          booleans[k][j] = true;
        }
      }
    }

    int area = 0;
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        if (booleans[i][j])
          area++;
      }
    }
    br.close();

    bw.write(area + "\n");
    bw.flush();
    bw.close();
  }
}
