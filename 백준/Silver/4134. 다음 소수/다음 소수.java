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

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      long num = Long.parseLong(br.readLine());

      if (num == 0 || num == 1) {
        sb.append(2).append("\n");
      } else {
        while (true) {
          if (num == 2 || num == 3) {
            sb.append(num).append("\n");
            break;
          }
          if (num % 2 == 0 || num % 3 == 0) {
            num++;
            continue;
          }

          // 5부터 홀수만 검사 (6k ± 1 패턴)
          boolean prime = true;
          for (long j = 5; j * j <= num; j += 6) {
            if (num % j == 0 || num % (j + 2) == 0) {
              prime = false;
              break;
            }
          }

          if (prime) {
            sb.append(num).append("\n");
            break;
          }
          num++;
        }
      }
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}