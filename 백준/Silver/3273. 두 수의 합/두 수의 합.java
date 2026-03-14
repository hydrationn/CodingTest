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

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(intArr);

        int cnt = 0;

        int left = 0;
        int right = n-1;

        while (left < right) {
            int sum = intArr[left] + intArr[right];

            if (x < sum) {
                right--;
            } else if (x > sum) {
                left++;
            } else {
                cnt++;
                left++;
            }
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
    }
}