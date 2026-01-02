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

        long X = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long Y = 0;
        int pos = 0;

        while (K > 0) {
            // X의 pos 비트가 0이면 Y에 K의 현재 가장 오른쪽 비트를 넣을 수 있는 빈칸
            if ((X & (1L << pos)) == 0) {
                if ((K & 1L) == 1L) {
                    Y |= (1L << pos);
                }
                // K의 다음 비트로 이동
                K >>= 1;
            }
            pos++;
        }

        bw.write(Y + "\n");
        bw.flush();
        bw.close();
    }
}