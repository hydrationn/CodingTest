class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int answerLength = num2 - num1 + 1;
        int[] answer = new int[answerLength];
        
        int j = num1;
        for (int i = 0; i < answerLength; i++) {
            answer[i] = numbers[j++];
        }
        return answer;
    }
}