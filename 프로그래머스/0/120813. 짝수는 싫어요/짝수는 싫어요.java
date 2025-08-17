class Solution {
    public int[] solution(int n) {
        int k;
        if (n % 2 == 0) {
            k = n / 2;
        } else {
            k = n / 2 + 1;
        }
        
        int[] answer = new int[k];
        for(int i = 0 ; i < answer.length; i++) {
            answer[i] = i * 2 + 1;
        }
        return answer;
    }
}