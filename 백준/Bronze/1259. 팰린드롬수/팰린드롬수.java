import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();

            if (s.equals("0")) {
                break;
            }

            boolean palindrome = true;
            for (int i = 0; i < s.length()/2; i++) {
                if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                    palindrome = false;
                    break;
                }
            }

            if (palindrome) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
        bw.close();
    }
}