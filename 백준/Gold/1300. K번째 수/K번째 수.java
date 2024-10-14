import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    /*// 아래 코드로 했다가 메모리 초과
    int N = Integer.parseInt(br.readLine());

    int[][] A = new int[N][N];
    List<Integer> B = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        A[i][j] = (i+1) * (j+1);
        B.add(A[i][j]);
      }
    }

    Collections.sort(B);

    int k = Integer.parseInt(br.readLine());

    bw.write(B.get(k) + " \n");*/

    // 블로그 참고 코드: * 𝑥 보다 작거나 같은 원소의 개수가 K값이랑 일치한다.
    int N = Integer.parseInt(br.readLine());
    int K = Integer.parseInt(br.readLine());

    // x는 low <= x <= high 의 범위를 갖는다.
    long low = 1;
    long high = K;

    // lower-bound
    while(low < high) {

      long mid = (low + high) / 2;	// 임의의 x(mid)를 중간 값으로 잡는다.
      long count = 0;

      /*
       *  임의의 x에 대해 i번 째 행을 나눔으로써 x보다 작거나 같은 원소의 개수
       *  누적 합을 구한다.
       *  이 때 각 행의 원소의 개수가 N(열 개수)를 초과하지 않는 선에서 합해주어야 한다.
       */
      for(int i = 1; i <= N; i++) {
        count += Math.min(mid / i, N);
      }

      // count가 많다는 것은 임의의 x(mid)보다 작은 수가 B[K]보다 많다는 뜻
      if(K <= count) {
        high = mid;
      }
      else {
        low = mid + 1;
      }
    }
    bw.write(low + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
