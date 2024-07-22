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

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = i + 1;
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int c1 = Integer.parseInt(st.nextToken()) - 1;
      int c2 = Integer.parseInt(st.nextToken()) - 1;

      int temp = arr[c1];
      arr[c1] = arr[c2];
      arr[c2] = temp;
    }

    for (int i = 0; i < n; i++) {
      bw.write(arr[i] + " ");
    }
    br.close();

    bw.flush();
    bw.close();
  }
}
