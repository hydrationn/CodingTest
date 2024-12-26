import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int maxScore = 0;
    int winner = 0;

    for (int i = 1; i <= 5; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int totalScore = 0;

      while (st.hasMoreTokens()) {
        totalScore += Integer.parseInt(st.nextToken());
      }

      if (totalScore > maxScore) {
        maxScore = totalScore;
        winner = i;
      }
    }

    System.out.println(winner + " " + maxScore);
  }
}
