import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int cntOdd = 0;
    int sum = 0;
    int min = 100;
    for (int i = 0; i < 7; i++) {
      int num = Integer.parseInt(br.readLine());

      if (num % 2 != 0) {
        cntOdd++;
        sum += num;
        min = Math.min(min, num);
      }
    }
    
    if (cntOdd == 0) {
      bw.write(-1 + "\n");
    } else {
      bw.write(sum + "\n");
      bw.write(min + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
