import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] intArr = new int[N];
        for (int i = 0; i < N; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(intArr);

        int left = 0;
        int right = N - 1;

        long min = Long.MAX_VALUE;
        int a = 0;
        int b = 0;

        while (left < right) {
            long sum = (long) intArr[left] + intArr[right];

            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                a = intArr[left];
                b = intArr[right];
            }

            if (sum > 0) {
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                break;
            }
        }

        bw.write(a + " " + b + "\n");

        bw.flush();
        bw.close();
    }
}