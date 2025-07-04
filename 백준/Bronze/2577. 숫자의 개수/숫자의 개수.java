import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] cnt = new int[10];

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());

    int answer = A * B * C;

    while (answer > 0) {
      cnt[answer % 10]++;
      answer /= 10;
    }
    br.close();

    for(int i = 0; i < cnt.length; i++) {
      bw.write(cnt[i] + "\n");
    }

    bw.flush();
    bw.close();
  }
}