import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static char[] catorArr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb;

    String input;
    while ((input = br.readLine()) != null) {
      int N = Integer.parseInt(input);
      sb = new StringBuilder();

      int len = (int) Math.pow(3, N);

      catorArr = new char[len];
      Arrays.fill(catorArr, '-');

      cantor(0, len);

      for(int i = 0; i < catorArr.length; i++){
        sb.append(catorArr[i]);
      }
      System.out.println(sb);
    }
    br.close();
  }

  // 구간 divide (start는 시작점, length는 구간 길이)
  public static void cantor(int start, int length) {
    if (length <= 1)
      return;

    int newlength = length / 3;

    for (int i = start + newlength; i < start + 2*newlength; i++) {
      catorArr[i] = ' ';
    }

    cantor(start, newlength);

    cantor(start + 2*newlength, newlength);
  }
}
