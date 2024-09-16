import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      // 공약수 리스트(factorList)
      List<Integer> factorList = new ArrayList<>();

      // 공약수들은 factorList에 add, for 문을 모두 거치고 나면 A, B는 각각 서로소가 된다.
      for (int j = 2; j <= B; j++) {
        while (A % j == 0 & B % j == 0) {
          A /= j;
          B /= j;
          factorList.add(j);
        }
      }

      int multiples = 1;

      for (int k = 0; k < factorList.size(); k++) {
        multiples *= factorList.get(k);
      }

      // 최소공배수 = 최대공약수 * 서로소들(for 문을 거친 A, B)
      sb.append(multiples * A * B + "\n");
    }

    br.close();
    
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}