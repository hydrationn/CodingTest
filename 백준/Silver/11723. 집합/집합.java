import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    Set<Integer> intSet = new HashSet<>();
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String order = st.nextToken();
      int x = 0;

      if (!order.equals("all") && !order.equals("empty")) {
        x = Integer.parseInt(st.nextToken());
      }

      switch (order) {
        // 1. add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
        case "add":
          intSet.add(x);  // 이미 있는 경우에도 중복 추가는 안 됨 (HashSet 특징)
          break;

        // 2. remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
        case "remove":
          intSet.remove(x);  // 없는 경우에도 문제 없음
          break;

        // 3. check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
        case "check":
          bw.write(intSet.contains(x) ? "1\n" : "0\n");
          break;

        // 4. toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
        case "toggle":
          if (intSet.contains(x)) {
            intSet.remove(x);
          } else {
            intSet.add(x);
          }
          break;

        // 5. all: S를 {1, 2, ..., 20} 으로 바꾼다.
        case "all":
          intSet.clear();
          for (int j = 1; j <= 20; j++) {
            intSet.add(j);
          }
          break;

        // 6. empty: S를 공집합으로 바꾼다.
        case "empty":
          intSet.clear();
          break;
      }
    }

    // BufferedWriter 닫기
    bw.flush();
    bw.close();
    br.close();
  }
}
