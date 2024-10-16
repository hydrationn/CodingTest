import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lan = new int[K];

        long max = 0;
        for (int i = 0; i < K; i++) {
            lan[i] = Integer.parseInt(br.readLine());
            if (max < lan[i]) {
                max = lan[i];
            }
        }
        
        long min = 1;
        long result = 0; // 최종 길이

        while (min <= max) {
            long mid = (min + max) / 2;
            long count = 0;

            // 구해진 중간 길이로 잘라서 총 몇 개의 랜선을 만들 수 있는지 계산
            for (int i = 0; i < lan.length; i++) {
                count += (lan[i] / mid);
            }

            // mid 길이로 N개 이상의 랜선을 만들 수 있다면
            if (count >= N) {
                result = mid;  // 가능한 최대 길이를 기록
                min = mid + 1;  // 더 긴 랜선을 만들 수 있는지 확인하기 위해 최소 길이를 늘리기
            } else {
                max = mid - 1;  // N개보다 적다면 길이를 줄이기
            }
        }

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
