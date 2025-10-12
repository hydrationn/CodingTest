class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int shareIdx = 1;
        for (int i = balls; i > share; i--) {
            answer *= i;
            answer /= shareIdx;
            shareIdx++;
        }
        
        return (int) answer;
    }
}