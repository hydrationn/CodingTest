import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] intArr = new int[3];
        for (int i = 0; i < 3; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(intArr);

        for (int n : intArr) {
            bw.write(n + " ");
        }

        bw.write("\n");
        bw.flush();
        bw.close();
    }
}