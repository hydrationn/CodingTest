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

    int start;
    int end;
    int set;

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      start = Integer.parseInt(st.nextToken()) - 1;
      end = Integer.parseInt(st.nextToken()) - 1;
      set = Integer.parseInt(st.nextToken());

      for (int j = start; j <= end; j++) {
        arr[j] = set;
      }
    }

    for (int i = 0; i < n; i++) {
      bw.write(arr[i] + " ");
    }
    br.close();

    bw.flush();
    bw.close();
  }
}
