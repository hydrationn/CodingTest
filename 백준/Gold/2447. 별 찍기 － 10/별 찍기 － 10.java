import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static String[][] starArr;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    starArr = new String[N][N];

    star(0, 0, N);

    // star() 이후 null인 배열에 대해 공백을, 그렇지 않으면 배열에 있는 값 출력
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (starArr[i][j] == null)
          sb.append(" ");
        else
          sb.append(starArr[i][j]);
      }
      sb.append("\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }

  public static void star(int x, int y, int N) {
    // 최소 1로 저장했으면 "*" 저장
    if (N == 1) {
      starArr[x][y] = "*";
      return;
    }

    /*
     * 별 찍기 (아래 모양 기준)
     *  ***
     *  * *
     *  ***
     */
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        // 가운데 빈공간이면 건너뛰기 (null 상태로 유지하기)
        if(!(i==1 && j==1))
          // x, y 값을 계속 유지하며 재귀 호출
          star(x + i*N/3, y + j*N/3, N/3);
      }
    }
  }
}
