import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<String, Integer> forest = new HashMap<>();

    String tree;
    int total = 0;
    while ((tree = br.readLine()) != null) {
      total++;
      forest.put(tree, forest.getOrDefault(tree, 0)+1);
    }

    List<String> forestList = new ArrayList<>(forest.keySet());
    Collections.sort(forestList);
    for (int i = 0; i < forest.size(); i++) {
      bw.write(forestList.get(i) + " " + String.format("%.4f", (double) forest.get(forestList.get(i))/total * 100.0) + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
