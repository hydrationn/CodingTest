class Solution {
    public int solution(int n) {
        int answer = n / 7;
        
        int overPizza = n % 7;
        if (overPizza == 0) {
            return answer;
        } else {
            return answer + 1;
        }
    }
}