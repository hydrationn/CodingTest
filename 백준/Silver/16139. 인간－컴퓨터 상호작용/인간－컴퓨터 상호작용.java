import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  // 누적합 이용
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    String string = br.readLine();
    int[][] cntArr = new int[26][string.length()];

    // 누적합 계산
    for (int i = 0; i < string.length(); i++) {
      int idxChar = string.charAt(i) - 'a';
      cntArr[idxChar][i]++;

      // 이전까지의 누적합 복사
      if (i > 0) {
        for (int j = 0; j < 26; j++) {
          cntArr[j][i] += cntArr[j][i - 1];
        }
      }
    }

    int q = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < q; i++) {
      st = new StringTokenizer(br.readLine());
      int idx = st.nextToken().charAt(0) - 'a';

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      int alphaCount;
      if (start == 0) {
        alphaCount = cntArr[idx][end];
      } else {
        alphaCount = cntArr[idx][end] - cntArr[idx][start-1];
      }
      sb.append(alphaCount).append("\n");
    }
    bw.write(sb.toString());

    br.close();

    bw.flush();
    bw.close();
  }

  /*public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    String string = br.readLine();

    int q = Integer.parseInt(br.readLine());

    int cnt;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < q; i++) {
      st = new StringTokenizer(br.readLine());

      cnt = 0;

      String alpha = st.nextToken();
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      for (int j = start; j <= end; j++) {
        if (String.valueOf(string.charAt(j)).equals(alpha)) {
          cnt++;
        }
      }
      sb.append(cnt).append("\n");
    }
    bw.write(sb.toString());

    br.close();

    bw.flush();
    bw.close();
  }*/
}
