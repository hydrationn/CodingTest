import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] burger = new int[3];
        for (int i = 0; i < 3; i++) {
            burger[i] = Integer.parseInt(br.readLine());
        }

        int[] beverage = new int[2];
        for (int i = 0; i < 2; i++) {
            beverage[i] = Integer.parseInt(br.readLine());
        }

        int minSet = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int set = burger[i] + beverage[j] - 50;

                if (minSet > set) {
                    minSet = set;
                }
            }
        }

        bw.write(minSet + "\n");
        bw.flush();
        bw.close();
    }
}