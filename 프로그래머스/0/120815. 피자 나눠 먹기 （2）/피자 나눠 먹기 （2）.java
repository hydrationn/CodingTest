class Solution {
    public int solution(int n) {
        int answer = lcm(n, 6) / 6;
        return answer;
    }
    
    // 최대공약수 - 유클리드 호제법 이용
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    // 최소공배수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}