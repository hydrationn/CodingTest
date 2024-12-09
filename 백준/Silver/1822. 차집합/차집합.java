import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int nA = Integer.parseInt(st.nextToken());
    int nB = Integer.parseInt(st.nextToken());

    Set<Integer> A = new HashSet<>();
    Set<Integer> B = new HashSet<>();

    // set A
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < nA; i++) {
      A.add(Integer.parseInt(st.nextToken()));
    }

    // set B
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < nB; i++) {
      int num = Integer.parseInt(st.nextToken());
      B.add(num);

      if (A.contains(num)) {
        A.remove(num);
      }
    }

    // set sorting 후 print
    List<Integer> AcomplementB = new ArrayList<>(A);
    Collections.sort(AcomplementB);

    int complementSize = AcomplementB.size();
    bw.write(complementSize + "\n");

    if (complementSize != 0) {
      for (int i = 0; i < complementSize; i++) {
        bw.write(AcomplementB.get(i) + " ");
      }
    }
    bw.newLine();

    br.close();
    bw.flush();
    bw.close();
  }
}
