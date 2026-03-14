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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] intArr = new int[a+b];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = a; i < a+b; i++) {
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