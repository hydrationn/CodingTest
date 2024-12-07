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

    int L = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    int[] partyMember = new int[5];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 5; i++) {
      partyMember[i] = Integer.parseInt(st.nextToken()) - L*P;
    }

    for (int gap : partyMember) {
      bw.write(gap + " ");
    }
    bw.newLine();
    
    br.close();
    bw.flush();
    bw.close();
  }
}
