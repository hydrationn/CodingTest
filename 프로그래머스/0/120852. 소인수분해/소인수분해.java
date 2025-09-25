import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> intList = new ArrayList<>();
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                intList.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        
        if (n > 1) {
            intList.add(n);
        }
        
        int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        
        return answer;
    }
}