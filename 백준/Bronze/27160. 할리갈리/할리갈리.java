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

    int N = Integer.parseInt(br.readLine());

    // 각 카드별 과일의 수를 나타냄.
    // 0번 STRAWBERRY, 1번 BANANA, 2번 LIME, 3번 PLUM
    int[] halliGalli = new int[4];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      String fruit = st.nextToken();
      int num = Integer.parseInt(st.nextToken());
      switch (fruit) {
        case "STRAWBERRY":
          halliGalli[0] += num;
          break;

        case "BANANA":
          halliGalli[1] += num;
          break;

        case "LIME":
          halliGalli[2] += num;
          break;

        case "PLUM":
          halliGalli[3] += num;
          break;
      }
    }

    boolean call = false;
    for (int i = 0; i < halliGalli.length; i++) {
      if (halliGalli[i] == 5) {
        call = true;
        break;
      }
    }

    if (call == true)
      bw.write("YES\n");
    else
      bw.write("NO\n");

    br.close();
    bw.flush();
    bw.close();
  }
}