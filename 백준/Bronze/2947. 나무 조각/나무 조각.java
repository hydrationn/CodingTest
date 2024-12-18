import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static int[] intArr;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    intArr = new int[5+1];
    for (int i = 1; i <= 5; i++) {
      intArr[i] = Integer.parseInt(st.nextToken());
    }

    while (!(intArr[1] == 1 && intArr[2] == 2 && intArr[3] == 3 && intArr[4] == 4 && intArr[5] == 5)) {
      // 1. 첫 번째 조각의 수가 두 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
      if (intArr[1] > intArr[2]) {
        change(intArr, 1, 2);
        print(intArr);
      }

      // 2. 두 번째 조각의 수가 세 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
      if (intArr[2] > intArr[3]) {
        change(intArr, 2, 3);
        print(intArr);
      }

      // 3. 세 번째 조각의 수가 네 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
      if (intArr[3] > intArr[4]) {
        change(intArr, 3, 4);
        print(intArr);
      }

      // 4. 네 번째 조각의 수가 다섯 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
      if (intArr[4] > intArr[5]) {
        change(intArr, 4, 5);
        print(intArr);
      }
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }

  public static void print(int[] intArr) {
    for (int i = 1; i <= 5; i++) {
      sb.append(intArr[i]).append(" ");
    };
    sb.append("\n");
  }
  
  public static void change(int[] intArr, int i, int j) {
    int temp = intArr[i];
    intArr[i] = intArr[j];
    intArr[j] = temp;
  }
}