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

    long sum = 0;
    for (int i = 0; i < 5; i++) {
      long num = Integer.parseInt(st.nextToken());
      sum += Math.pow(num, 2);
    }

    int result = (int) (sum % 10);
    bw.write(result + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
