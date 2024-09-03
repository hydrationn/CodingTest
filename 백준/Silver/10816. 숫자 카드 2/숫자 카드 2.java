import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int[] sangGeunArr = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      sangGeunArr[i] = Integer.parseInt(st.nextToken());
    }

    HashMap<Integer, Integer> sangGuenHashMap = new HashMap<Integer, Integer>();

    int count = 1;

    for (int value : sangGeunArr) {
      if (!sangGuenHashMap.containsKey(value)) {
        sangGuenHashMap.put(value, count);
      } else {
        sangGuenHashMap.replace(value, sangGuenHashMap.get(value)+1);
      }
    }

    int M = Integer.parseInt(br.readLine());
    int[] cardArr = new int[M];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      cardArr[i] = Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();
    for (int value : cardArr) {
      if (sangGuenHashMap.get(value) == null) {
        sb.append(0).append(" ");
        continue;
      }

      sb.append(sangGuenHashMap.get(value)).append(" ");
    }

    br.close();

    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
