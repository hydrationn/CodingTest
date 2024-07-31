import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(br.readLine());

    int cnt = 0;

    for (int i = 0; i < n; i++) {
      if (check()) {
        cnt++; // 그룹 단어 추가
      }
    }
    br.close();

    bw.write(cnt + "\n");
    bw.close();
  }

  public static boolean check() throws IOException { // 그룹단어 체크 메서드
    boolean[] check = new boolean[26]; // 이전에 알파벳들이 존재했는지 여부를 판단하기 위한 array
    int prev = -1;

    String str = br.readLine().toString();

    for (int i = 0; i < str.length(); i++) {
      int now = str.charAt(i);

      if (prev != now) { // 바로 이전 단어와 다르다면
        if (check[now-'a'] == false) { // 이전에 존재했는지 체크, 나오지 않았다면(false)
          check[now-'a'] = true;
          prev = now;
        } else {
          return false; // 이전에 존재했는지 체크, 나왔으면(true) false return
        }
      } else { // 바로 이전 단어와 같으면 문자가 연속되어 나오는 것을 의미
        continue;
      }
    }

    return true;
  }
}
