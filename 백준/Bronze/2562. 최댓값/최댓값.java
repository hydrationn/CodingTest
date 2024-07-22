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

    StringTokenizer st;
    int[] arr = new int[9];

    for (int i = 0; i < 9; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int max= arr[0];
    int index = 1;

    for (int i = 0; i < 9; i++) {
      if(arr[i] > max) {
        max = arr[i];
        index = i+1;
      }
    }
    bw.write(max + "\n");
    bw.write(index + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
