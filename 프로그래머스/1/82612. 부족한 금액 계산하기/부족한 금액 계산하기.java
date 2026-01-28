class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long cost = 0;
        for (int i = 1; i <= count; i++) {
            cost += price * i;
        }

        if (cost >= money) {
            answer = cost - money;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}