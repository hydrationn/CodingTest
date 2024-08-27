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
    String[] strArr = new String[N];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      strArr[i] = String.valueOf(st.nextToken());
    }

    // Comparator에 있는 메서드 compare override
    // 길이가 짧은 순서대로, 같으면 사전 순
    Arrays.sort(strArr, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        if (s1.length() == s2.length()) {
          return s1.compareTo(s2);
        } else {
          return s1.length() - s2.length();
        }
      }
    });

    // 가장 앞에 있는 문자열 먼저 출력 후, 중복 제거
    bw.write(strArr[0] + "\n");
    for (int i = 1; i < N; i++) {
      if (!strArr[i].equals(strArr[i-1])) {
        bw.write(strArr[i] + "\n");
      }
    }
    
    br.close();
    bw.flush();
    br.close();
  }
}
