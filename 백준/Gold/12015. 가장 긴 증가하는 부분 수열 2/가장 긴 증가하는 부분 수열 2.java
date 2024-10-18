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
    List<Integer> integerList = new ArrayList<>();
    integerList.add(0);

    StringTokenizer st = new StringTokenizer(br.readLine());

    int value, left, right, mid;
    for (int i = 0; i < N; i++) {
      value = Integer.parseInt(st.nextToken());

      if (value > integerList.get(integerList.size()-1))
        integerList.add(value);
      else {
        left = 0;
        right = integerList.size()-1;
        while (left < right) {
          mid = (left + right) / 2;
          if (value > integerList.get(mid)) {
            left = mid + 1;
          } else {
            right = mid;
          }
        }
        integerList.set(right, value);
      }
    }
    bw.write(integerList.size()-1 + "\n");

    br.close();

    bw.flush();
    bw.close();
  }
}
