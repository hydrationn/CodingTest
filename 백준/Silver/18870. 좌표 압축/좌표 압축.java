import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] intArr = new int[N];
    int[] sortArr = new int[N];
    HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      intArr[i] = sortArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(sortArr);

    int rank = 0;

    for (int value : sortArr) {
      if (!rankMap.containsKey(value)) {
        rankMap.put(value, rank);
        rank++;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int value : intArr) {
      sb.append(rankMap.get(value)).append(" ");
    }

    bw.write(sb.toString());
    br.close();
    bw.flush();
    bw.close();
  }
}
