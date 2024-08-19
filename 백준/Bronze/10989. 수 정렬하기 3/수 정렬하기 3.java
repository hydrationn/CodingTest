import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] intArr = new int[N];

    for (int i = 0; i < N; i++) {
      intArr[i] = Integer.parseInt(br.readLine());
    }

//    // shell sort
//    for (int i = intArr.length/2; i > 0; i /= 2) {
//      for (int j = i; j < intArr.length; j++) {
//        int temp = intArr[j];
//        int k = j - i;
//
//        while (k >= 0 && intArr[k] > temp) {
//          intArr[k+i] = intArr[k];
//          k -= i;
//        }
//
//        intArr[k + i] = temp;
//      }
//    }

    Arrays.sort(intArr);

    for (int i: intArr) {
      bw.write(i + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}