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

    st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int min = arr[0];
    int max= arr[0];

    for (int i = 0; i < arr.length; i++) {
      if(arr[i] < min) {
        min = arr[i];
      }

      if(arr[i] > max) {
        max = arr[i];
      }
    }
    bw.write(min + " " + max);
    br.close();

    bw.flush();
    bw.close();
  }
}
