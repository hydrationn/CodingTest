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

        int cnt = 0;

        while (N >= 5) {
            N /= 5;
            cnt += N;
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}