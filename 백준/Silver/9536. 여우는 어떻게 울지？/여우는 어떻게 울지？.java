import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    
    for (int k = 0; k < N; k++) {
      String tc = br.readLine();

      Map<String, String> cryingMap = new HashMap<>();

      String crying;
      while (!(crying = br.readLine()).equals("what does the fox say?")) {
        st = new StringTokenizer(crying);
        String animal = st.nextToken();
        String goes = st.nextToken();
        String cryingOfAnimal = st.nextToken();

        if (!cryingMap.containsKey(animal)) {
          cryingMap.put(cryingOfAnimal, animal);
        }
      }

      StringBuilder sb = new StringBuilder();
      st = new StringTokenizer(tc);

      int cryingLength = st.countTokens();
      for (int i = 0; i < cryingLength; i++) {
        String cry = st.nextToken();
        if (!cryingMap.containsKey(cry)) {
          sb.append(cry).append(" ");
        }
      }
      bw.write(sb.toString());
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
