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
    int[] intArr = new int[n];

    for (int i = 0; i < n; i++) {
      intArr[i] = Integer.parseInt(br.readLine());
    }

    // Selection Sort
    for(int i = 0; i < intArr.length - 1; i++) {
      for(int j = i + 1; j < intArr.length; j++) {

        if(intArr[i] > intArr[j]) {
          int temp = intArr[j];
          intArr[j] = intArr[i];
          intArr[i] = temp;
        }
      }
    }
    
    for (int i : intArr) {
      bw.write(i + "\n");
    }
    br.close();

    bw.flush();
    bw.close();
  }
}
