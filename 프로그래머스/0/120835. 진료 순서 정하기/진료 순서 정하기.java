import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        
        Map<Integer, Integer> intMap = new HashMap<>();
        
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            intMap.put(sorted[i], r++);
        }
        
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = intMap.get(emergency[i]);
        }
        
        return answer;
    }
}