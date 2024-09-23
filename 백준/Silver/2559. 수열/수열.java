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

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] tempArr = new int[N+1];

    st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i++) {
      tempArr[i] = Integer.parseInt(st.nextToken());
    }
    
    int sum = 0;
    for (int i = 1; i <= K; i++) {
      sum += tempArr[i];
    }

    int start = 1;
    int end = K+1;
    
    int maxSum = sum;
    while (end <= N) {
      sum -= tempArr[start];
      sum += tempArr[end];

      if (maxSum < sum) {
        maxSum = sum;
      }

      start++;
      end++;
    }
    bw.write(maxSum + "\n");

    br.close();

    bw.flush();
    bw.close();
  }
}
