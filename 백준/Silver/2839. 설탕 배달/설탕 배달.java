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

    int plasticBag =-1;

    for (int i = N / 5; i >= 0; i--) {
      int remain = N - (i * 5);
      
      if (remain % 3 == 0) {
        plasticBag = i + (remain / 3);
        break;
      }
    }
    bw.write(plasticBag + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
