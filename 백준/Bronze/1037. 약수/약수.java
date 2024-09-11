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

    int N = Integer.parseInt(br.readLine());
    int[] intArr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      intArr[i] = Integer.parseInt(st.nextToken());
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      if (max < intArr[i]) {
        max = intArr[i];
      }
      if (min > intArr[i]) {
        min = intArr[i];
      }
    }

    bw.write(max * min + "\n");

    br.close();

    bw.flush();
    bw.close();
  }
}
