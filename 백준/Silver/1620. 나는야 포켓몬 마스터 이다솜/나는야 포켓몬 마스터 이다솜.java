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
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken()); // 포켓몬 도감에 들어갈 포켓몬 수
    int M = Integer.parseInt(st.nextToken()); // 문제 수

    // 포켓몬 도감 만들기
    HashMap<Integer, String> numPokemonMap = new HashMap<Integer, String>();
    HashMap<String, Integer> namePokemonMap = new HashMap<String, Integer>();

    int no = 1;

    for (int i = 0; i < N; i++) {
      String name = String.valueOf(br.readLine());
      numPokemonMap.put(no, name);
      namePokemonMap.put(name, no++);
    }

    // 문제 시작
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < M; i++) {
      String line = br.readLine();
      try {
        int question = Integer.parseInt(line);
        answer.append(numPokemonMap.get(question) + "\n");
      } catch (NumberFormatException numberFormatException) {
        answer.append(namePokemonMap.get(line) + "\n");
      }
    }
    answer.append("\n");
    
    br.close();

    bw.write(answer.toString());
    bw.flush();
    bw.close();
  }
}
