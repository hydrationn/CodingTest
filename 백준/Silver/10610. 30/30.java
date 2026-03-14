import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split("");

        int sum = 0;
        boolean zero = false;
        for (int i = 0; i < strArr.length; i++) {
            int n = Integer.parseInt(strArr[i]);

            if (n == 0) {
                zero = true;
            }

            sum += n;
        }

        String result = "";
        if (sum % 3 != 0 || zero == false) {
            result = "-1";
        } else {
            Arrays.sort(strArr, Comparator.reverseOrder());
            for (int i = 0; i < strArr.length; i++) {
                result += strArr[i];
            }
        }
        bw.write(result + "\n");

        bw.flush();
        bw.close();
    }
}