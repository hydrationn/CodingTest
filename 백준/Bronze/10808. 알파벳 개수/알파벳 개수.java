import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int[] alphabet = new int[26];

        for (int i = 0; i < S.length(); i++) {
            int target = S.charAt(i) - 97;
            alphabet[target]++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
        System.out.println();
    }
}
