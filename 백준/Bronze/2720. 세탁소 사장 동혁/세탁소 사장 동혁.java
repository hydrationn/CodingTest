import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());

    int quarter = 25;
    int dime = 10;
    int nickel = 5;
    int penny = 1;

    for (int i = 0; i < T; i++) {
      int coin = Integer.parseInt(br.readLine());

      sb.append(coin / quarter + " ");
      coin %= quarter;

      sb.append(coin / dime + " ");
      coin %= dime;

      sb.append(coin / nickel + " ");
      coin %= nickel;

      sb.append(coin / penny + "\n");
    }
    bw.write(sb.toString());
    br.close();

    bw.flush();
    bw.close();
  }
}
