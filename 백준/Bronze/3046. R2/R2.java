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

    int R1 = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());

    // S = (R1+R2)/2
    int R2 = 2 * S - R1;
    bw.write( R2+ "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
