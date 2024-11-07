import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long[] fibonacci = new long[50];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.println(fibonacciValue(n));
    }

    public static long fibonacciValue(int n) {
        if (n <= 1) {
            return fibonacci[n];
        }
        
        if (fibonacci[n] == 0) {
            fibonacci[n] = fibonacciValue(n - 1) + fibonacciValue(n - 2);
        }
        return fibonacci[n];
    }
}
