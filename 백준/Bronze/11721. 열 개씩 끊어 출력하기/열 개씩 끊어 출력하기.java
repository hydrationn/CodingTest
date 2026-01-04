import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int startIdx = 0;
        int endIdx = 10;

        for (int i = 0; i < str.length() / 10 + 1; i++) {
            if (str.length() > endIdx) {
                System.out.println(str.substring(startIdx, endIdx));
            } else {
                System.out.println(str.substring(startIdx, str.length()));
            }

            startIdx += 10;
            endIdx += 10;
        }
    }
}
