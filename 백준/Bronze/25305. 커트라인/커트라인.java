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
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int[] intArr = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      intArr[i] = Integer.parseInt(st.nextToken());
    }

    // bubble sort
    for (int i = 0; i < intArr.length - 1; i++) {
      for (int j = 0; j < intArr.length - i - 1; j++) {
        if (intArr[j] < intArr[j+1]) {
          int temp = intArr[j];
          intArr[j] = intArr[j+1];
          intArr[j+1] = temp;
        }
      }
    }

    bw.write(intArr[k-1] + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
