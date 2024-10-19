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
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());

    int[] home = new int[N];

    for (int i = 0; i < N; i++) {
      home[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(home);

    long minValue = 1;
    long maxValue = home[N-1] - home[0];
    long result = 0;

    while (minValue <= maxValue) {
      long mid = (minValue + maxValue) / 2;
      long count = 1;
      long previous = home[0];

      for (int i = 1; i < home.length; i++) {
        if (home[i] >= previous + mid) {
          previous = home[i];
          count++;
        }
      }

      // mid 길이로 C개의 공유기를 설치할 수 있으면 가장 인접한 두 공유기 사이의 최대 거리를 result에 저장
      if (count >= C) {
        result = mid;  // 가능한 최대 거리 저장
        minValue = mid + 1;  // 더 큰 거리를 탐색
      } else {
        maxValue = mid - 1;  // 너무 많이 설치할 수 없는 경우, 거리를 줄임
      }
    }
    bw.write(result + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
