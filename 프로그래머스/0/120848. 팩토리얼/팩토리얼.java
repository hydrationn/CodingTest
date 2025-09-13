class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= 10; i++) {
            int target = factorial(i);
            
            if (target <= n) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
    
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}