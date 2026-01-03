import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        st = new StringTokenizer(br.readLine());

        int boxCount = 1;
        int current = 0;

        for (int i = 0; i < N; i++) {
            int w = Integer.parseInt(st.nextToken());

            if (current + w <= M) {
                current += w;
            } else {
                boxCount++;
                current = w;
            }
        }

        bw.write(boxCount + "\n");
        bw.flush();
        bw.close();
    }
}