import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] intArr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(intArr);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            boolean good = false;
            while (left < right) {
                if (left == i) {
                    left++;
                    continue;
                }
                if (right == i) {
                    right--;
                    continue;
                }

                int sum = intArr[left] + intArr[right];

                if (intArr[i] == sum) {
                    good = true;
                    break;
                } else if (intArr[i] < sum) {
                    right--;
                } else {
                    left++;
                }
            }

            if (good) {
                cnt++;
            }
        }
        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
    }
}