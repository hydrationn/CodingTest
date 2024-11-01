import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    List<Integer> intList = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      intList.add(i);
    }

    sb.append("<");
    int idxK = 0;
    int idx = 0;
    while (intList.size() >= 2) {
      if (intList.size() == N)
        idxK = idxK + K - 1;
      else
        idxK = idx + K - 1 ;
      
      idx = idxK % intList.size();

      sb.append(intList.remove(idx)).append(", ");
    }
    sb.append(intList.remove(0)).append(">");

    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
