import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[][] timeTable = new int[N][2];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      timeTable[i][0] = Integer.parseInt(st.nextToken());
      timeTable[i][1] = Integer.parseInt(st.nextToken());
    }

    // 종료 시간을 기준으로 정렬
    Arrays.sort(timeTable, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        // 종료 시간이 같은 경우 시작 시간이 빠른 순으로 정렬
        if (o1[1] == o2[1])
          return o1[0] - o2[0];
        // 종료 시간이 다르면 빠른 순으로 정렬
        else
          return o1[1] - o2[1];
      }
    });

    int cnt = 0;
    int end = 0;
    for (int i = 0; i < N; i++) {
      if (end <= timeTable[i][0]) {
        end = timeTable[i][1];
        cnt++;
      }
    }
    bw.write(cnt + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
