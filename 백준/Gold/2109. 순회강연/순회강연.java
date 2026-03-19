import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] lectures = new int[n][2]; // pay, day

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            lectures[i][0] = Integer.parseInt(st.nextToken());
            lectures[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lectures, (a, b) -> a[1] - b[1]); // day 오름차순

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int pay = lectures[i][0];
            int day = lectures[i][1];

            pq.offer(pay);

            if (pq.size() > day) {
                pq.poll(); // 가장 싼 강연 제거
            }
        }

        int totalPay = 0;
        while (!pq.isEmpty()) {
            totalPay += pq.poll();
        }

        bw.write(totalPay + "\n");
        bw.flush();
        bw.close();
    }
}