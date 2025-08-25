import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int result1 = numbers[0] * numbers[1];
        int result2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        int answer = result1 > result2 ? result1 : result2;
        return answer;
    }
}