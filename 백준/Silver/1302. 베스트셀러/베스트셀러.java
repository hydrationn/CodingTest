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

    int N = Integer.parseInt(br.readLine());
    Map<String, Integer> bookStore = new HashMap();

    int bestseller = 0;
    for (int i = 0; i < N; i++) {
      String book = br.readLine();

      if (!bookStore.containsKey(book)) {
        bookStore.put(book, 1);
      } else {
        bookStore.replace(book, bookStore.get(book) + 1);
      }

      if (bestseller < bookStore.get(book))
        bestseller = bookStore.get(book);
    }

    List<String> bestsellerList = new ArrayList<>();

    for (Map.Entry<String, Integer> entry : bookStore.entrySet()) {
      if (entry.getValue() == bestseller)
        bestsellerList.add(entry.getKey());
    }
    Collections.sort(bestsellerList);

    bw.write(bestsellerList.get(0));

    br.close();
    bw.flush();
    bw.close();
  }
}
