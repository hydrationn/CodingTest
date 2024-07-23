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
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    double[] arr = new double[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Double.parseDouble(st.nextToken());
    }

    double m = arr[0];
    for (int i = 0; i < n; i++) {
      if (m < arr[i]) {
        m = arr[i];
      }
    }

    for (int i = 0; i < n; i++) {
      arr[i] = arr[i]/m * 100;
    }

    double total = 0;
    for (int i = 0; i < n; i++) {
      total += arr[i];
    }

    double avg = total / n;
    br.close();

    bw.write(avg + "\n");
    bw.flush();
    bw.close();
  }
}
