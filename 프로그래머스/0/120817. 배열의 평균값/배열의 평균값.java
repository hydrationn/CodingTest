class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int N = numbers.length;
        for (int i = 0; i < N; i++) {
            answer += numbers[i];
        }
        answer /= N;
        return answer;
    }
}