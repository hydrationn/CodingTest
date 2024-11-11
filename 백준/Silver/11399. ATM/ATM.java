import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[] timeArr = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      timeArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(timeArr);

    int totalTime = 0;
    int person = 0;
    for (int i = 0; i < N; i++) {
      person += timeArr[i];
      totalTime += person;
    }
    bw.write(totalTime + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
