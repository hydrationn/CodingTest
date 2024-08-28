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
    String[][] strArr = new String[N][2];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      strArr[i][0] = String.valueOf(st.nextToken());
      strArr[i][1] = String.valueOf(st.nextToken());
    }

    // Comparator에 있는 메서드 compare override
    // 나이가 적은 순, 나이가 같으면 가입한 순
    Arrays.sort(strArr, new Comparator<String[]>() {
      @Override
      public int compare(String[] s1, String[] s2) {
        return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
      }
    });

    for (int i = 0; i < N; i++) {
      bw.write(strArr[i][0] + " " + strArr[i][1] + "\n");
    }
    
    br.close();
    bw.flush();
    br.close();
  }
}
