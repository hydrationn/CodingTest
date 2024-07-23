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
    int[] arr = new int[42];

    for (int i = 0; i < 10; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());

      int b = a % 42;
      arr[b] += 1;
    }

    int cnt = 0;
    for (int i = 0; i < 42; i++) {
      if(arr[i] != 0) {
        cnt++;
      }
    }
    bw.write(cnt + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
