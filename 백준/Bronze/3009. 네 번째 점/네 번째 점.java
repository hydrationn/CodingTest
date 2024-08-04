import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int[] xArr = new int[3];
    int[] yArr = new int[3];

    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());

      xArr[i] = Integer.parseInt(st.nextToken());
      yArr[i] = Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();

    if (xArr[0] == xArr[1])
      sb.append(xArr[2]).append(" ");
    else if (xArr[0] == xArr[2])
      sb.append(xArr[1]).append(" ");
    else if (xArr[1] == xArr[2])
      sb.append(xArr[0]).append(" ");

    if (yArr[0] == yArr[1])
      sb.append(yArr[2]).append(" ");
    else if (yArr[0] == yArr[2])
      sb.append(yArr[1]).append(" ");
    else if (yArr[1] == yArr[2])
      sb.append(yArr[0]).append(" ");

    bw.write(sb + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
