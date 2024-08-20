import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String line = br.readLine();

    int[] intArr = new int[line.length()];

    for (int i = 0; i < line.length(); i++) {
      intArr[i] = Integer.parseInt(String.valueOf(line.charAt(i)));
    }

    // selections sort(reverse)
    for (int i = 0; i < intArr.length - 1; i++) {
      int maxIdx = i;
      for (int j = i + 1; j < intArr.length; j++) {
        if (intArr[j] > intArr[maxIdx]) {
          maxIdx = j;
        }
      }

      int temp = intArr[i];
      intArr[i] = intArr[maxIdx];
      intArr[maxIdx] = temp;
    }

    for (int i : intArr) {
      bw.write(i + "");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}