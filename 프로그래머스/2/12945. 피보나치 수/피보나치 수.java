class Solution {
    static int[] fibonacciArr;
    static final int MOD = 1234567;

    public int solution(int n) {
        fibonacciArr = new int[n + 1];

        fibonacciArr[0] = 0;
        fibonacciArr[1] = 1;

        return fibonacci(n);
    }

    public int fibonacci(int n) {
        if (fibonacciArr[n] != 0 || n == 0) {
            return fibonacciArr[n];
        }
        fibonacciArr[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % MOD;
        
        return fibonacciArr[n];
    }
}
