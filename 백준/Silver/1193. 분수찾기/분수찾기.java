import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int crossCount = 1;
    int prevCountSum = 0;

    while (true) {
      // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
      if (n <= prevCountSum + crossCount) {

        if (crossCount % 2 == 1) {	// 대각선의 개수가 홀수라면
          // 분자가 큰 수부터 시작
          // 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
          // 분모는 X 번째 - 직전 대각선까지의 블럭 개수
          System.out.print((crossCount - (n - prevCountSum - 1)) + "/" + (n - prevCountSum));
          break;
        }

        else {	// 대각선상의 블럭의 개수가 짝수라면
          // 홀수일 때의 출력을 반대로
          System.out.print((n - prevCountSum) + "/" + (crossCount - (n - prevCountSum - 1)));
          break;
        }

      } else {
        prevCountSum += crossCount;
        crossCount++;
      }

    }
    br.close();

    bw.flush();
    bw.close();
  }
}
