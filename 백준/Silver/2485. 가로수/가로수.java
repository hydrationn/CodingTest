import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] load = new int[N];

    for (int i = 0; i < N; i++) {
      load[i] = Integer.parseInt(br.readLine());
    }

    int gcd = load[load.length-1] - load[load.length-2];
    int gap = 0;
    for (int i = load.length-2; i > 0; i--) {
      gap = load[i] - load[i-1];
      gcd = gcd(gap, gcd);
    }

    int necessaryTree = (load[load.length-1] - load[0]) / gcd + 1 - load.length;
    bw.write(necessaryTree + "\n");
    
    br.close();
    bw.flush();
    bw.close();
  }

  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    else
      return gcd(b, a % b);
  }
}