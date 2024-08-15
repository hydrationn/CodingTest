import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] intArr = new int[5];

    for (int i = 0; i < 5; i++) {
      intArr[i] = Integer.parseInt(br.readLine());
    }

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += intArr[i];
    }
    bw.write(sum/5 + "\n");

    // insertion sort
    for (int i = 0; i < intArr.length - 1; i++) {
      int minIdx = i;
      for (int j = i + 1; j < intArr.length; j++) {
        if (intArr[j] < intArr[minIdx]) {
          minIdx = j;
        }
      }

      int temp = intArr[i];
      intArr[i] = intArr[minIdx];
      intArr[minIdx] = temp;
    }
    bw.write(intArr[2] + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
