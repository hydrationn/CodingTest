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

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
      
    int[][] dp = new int[n+1][n+1];
      
    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= n; j++) {
        dp[i][j] = dp[i][j-1] + Integer.parseInt(st.nextToken());
      }
    }

    StringBuilder sb = new StringBuilder();
      
    for (int k = 1; k <= m; k++) {
      int sum = 0;
        
      st = new StringTokenizer(br.readLine());
        
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
        
      for (int i = x1; i <= x2; i++) {
        sum = sum + (dp[i][y2] - dp[i][y1-1]);
      }
        
      sb.append(sum + "\n");
    }
    bw.write(sb.toString());
    
    br.close();
    
    bw.flush();
    bw.close();
  }
}
