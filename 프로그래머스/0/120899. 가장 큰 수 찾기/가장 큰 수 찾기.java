import java.util.List;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> result = new LinkedList<>();
        
        int max = array[0];
        int maxIdx = 0;
        for(int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIdx = i;
            }
        }
        result.add(max);
        result.add(maxIdx);
        
        int[] answer = result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
        
        return answer;
    }
}