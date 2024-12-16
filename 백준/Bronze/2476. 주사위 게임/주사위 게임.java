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

    int result = 0;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      int price = 0;
      
      // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
      if (A == B && B == C) {
        price = 10000 + A * 1000;
        result = Math.max(result, price);
      }
      // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
      else if (A == B || B == C || A == C) {
        if (A == B || B == C) {
          price = 1000 + B * 100;
        } else {
          price = 1000 + A * 100;
        }
        result = Math.max(result, price);
      }
      // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
      else {
        int max = Math.max(A, Math.max(B, C));
        price = max * 100;
        result = Math.max(result, price);
      }
    }
    bw.write(result + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
