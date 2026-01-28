import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Set<Integer> intSet = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            intSet.add(numbers[i]);
        }
        
        for (int i = 0; i <= 9; i++) {
            if (!intSet.contains(i)) {
                answer += i;
            }
        }
        
        return answer;
    }
}