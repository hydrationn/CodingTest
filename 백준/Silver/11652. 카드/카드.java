import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    HashMap<Long, Integer> cardMap = new HashMap<>();

    int N = Integer.parseInt(br.readLine());

    int max = 0;
    for (int i = 0; i < N; i++) {
       long num = Long.parseLong(br.readLine());
      cardMap.put(num, cardMap.getOrDefault(num, 0)+1);
      max = Math.max(max, cardMap.get(num));
    }

    List<Long> cardList = new ArrayList<>(cardMap.keySet());
    Collections.sort(cardList);
    for (int i = 0; i < cardList.size(); i++) {
      if (cardMap.get(cardList.get(i)) == max) {
        bw.write(cardList.get(i) + "\n");
        break;
      }
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
