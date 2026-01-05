import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        long result = 1;
        A %= C;

        while (B > 0) {
            if (B % 2 == 1) {
                result = (result * A) % C; // 홀수면 한 번 곱함
            }
            A = (A * A) % C; // A를 제곱
            B /= 2; // B를 반으로
        }

        System.out.println((int) result);
    }
}
