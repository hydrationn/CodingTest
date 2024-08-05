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

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int max = Math.max(a, Math.max(b, c));
    int restSum = a + b + c - max;
    int sum;

    if (max < restSum) {
      sum = a + b + c;
    } else if (max == restSum) {
      sum = a + b + c - 1;
    } else {
      sum = restSum * 2 - 1;
    }

    bw.write(sum + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
