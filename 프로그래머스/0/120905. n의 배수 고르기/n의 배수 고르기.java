import java.util.List;
import java.util.LinkedList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> result = new LinkedList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                result.add(numlist[i]);
            }
        }
        
        int[] answer = result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
        
        return answer;
    }
}