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

    int bread = Integer.parseInt(st.nextToken());
    int patty = Integer.parseInt(st.nextToken());
    int hamburger;

    int breadSet = bread / 2;
    if (breadSet >= patty)
      hamburger = patty;
    else
      hamburger = breadSet;

    bw.write(hamburger + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}