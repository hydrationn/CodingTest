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
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());

    int[] xArr = new int[n];
    int[] yArr = new int[n];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      xArr[i] = Integer.parseInt(st.nextToken());
      yArr[i] = Integer.parseInt(st.nextToken());
    }

    int minX = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxY = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      if (minX > xArr[i]) {
        minX = xArr[i];
      }
      if (maxX < xArr[i]) {
        maxX = xArr[i];
      }

      if (minY > yArr[i]) {
        minY = yArr[i];
      }
      if (maxY < yArr[i]) {
        maxY = yArr[i];
      }
    }

    int area;

    if (n ==1)
      area = 0;
     else
       area = (maxX - minX) * (maxY - minY);

    bw.write(area + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
