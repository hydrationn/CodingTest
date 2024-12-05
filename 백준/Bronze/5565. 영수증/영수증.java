import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int total = Integer.parseInt(br.readLine());

    for (int i = 0; i < 9; i++) {
      total -= Integer.parseInt(br.readLine());
    }
    bw.write(total + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
