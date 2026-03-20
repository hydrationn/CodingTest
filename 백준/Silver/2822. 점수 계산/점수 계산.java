import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] problems = new int[8];
        Map<Integer, Integer> proMap = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            int score = Integer.parseInt(br.readLine());

            problems[i] = score;
            proMap.put(score, i);
        }

        Arrays.sort(problems);
        int[] selected = new int[5];

        int result = 0;
        int idx = 0;
        for (int i = 7; i >= 3; i--) {
            result += problems[i];
            selected[idx++] = proMap.get(problems[i]) + 1;
        }

        Arrays.sort(selected);

        sb.append(result + "\n");
        for (int i = 0; i < 5; i++) {
            sb.append(selected[i]).append(" ");
        }
        sb.append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}