import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    
    int maxN = 1000000;
    boolean[] isPrimeNumber = new boolean[maxN + 1];
    Arrays.fill(isPrimeNumber, true);
    isPrimeNumber[0] = isPrimeNumber[1] = false;

    for (int i = 2; i * i <= maxN; i++) {
      if (isPrimeNumber[i]) {
        for (int j = i * i; j <= maxN; j += i) {
          isPrimeNumber[j] = false;
        }
      }
    }

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());
      int count = 0;

      // 골드바흐 파티션 개수 계산
      for (int j = 2; j <= num / 2; j++) {
        if (isPrimeNumber[j] && isPrimeNumber[num - j]) {
          count++;
        }
      }

      sb.append(count).append("\n");
    }
    bw.write(sb.toString());
    
    br.close();
    bw.flush();
    bw.close();
  }
}
