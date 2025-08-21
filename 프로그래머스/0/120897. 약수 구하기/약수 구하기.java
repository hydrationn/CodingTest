import java.util.List;
import java.util.LinkedList;

class Solution {
    public int[] solution(int n) {
        List<Integer> result = new LinkedList<>();
        
        for(int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        
        int[] answer = result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
        
        return answer;
    }
}