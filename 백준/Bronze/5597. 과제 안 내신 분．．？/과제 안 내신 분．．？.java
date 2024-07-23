import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[31];

    for (int i = 1; i < 31; i++) {
      arr[i] = i;
    }

    for (int i = 0; i < 28; i++) {
      int pass = Integer.parseInt(br.readLine());
      arr[pass] = -1;
    }

    for (int i = 1; i < 31; i++) {
      if(arr[i] != -1)
        bw.write(arr[i] + "\n");
    }
    br.close();

    bw.flush();
    bw.close();
  }
}
