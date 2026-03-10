import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());

            int[] score = new int[M];
            double total = 0;
            for (int j = 0; j < M; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                total += score[j];
            }

            double average = total / M;

            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (average < score[j]) {
                    cnt++;
                }
            }

            bw.write(String.format("%.3f", (double) cnt / M * 100) + "%\n");
        }

        bw.flush();
        bw.close();
    }
}