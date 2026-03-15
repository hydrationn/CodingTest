import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            String[] list = new String[n];

            for (int j = 0; j < n; j++) {
                list[j] = br.readLine();
            }

            Arrays.sort(list);

            boolean contain = false;
            for (int j = 0; j < n - 1; j++) {
                if (list[j + 1].startsWith(list[j])) {
                    contain = true;
                    break;
                }
            }

            if (contain) {
                bw.write("NO\n");
            } else {
                bw.write("YES\n");
            }
        }

        bw.flush();
        bw.close();
    }
}