class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n == 1 || n == 2 || n == 3) {
            return answer;
        } else {
            for (int i = 4; i <= n; i++) {
                for(int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}