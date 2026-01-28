class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // 약수의 개수
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    cnt++;
                } else if (i % j == 0) {
                    cnt += 2;
                }
            }
            
            // 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺴기
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}