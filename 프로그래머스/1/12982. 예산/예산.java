import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        int[] departmentBudget = d;
        Arrays.sort(departmentBudget);
        
        int remainder = budget;
        for (int i = 0; i < d.length; i++) {
            remainder -= departmentBudget[i];
            
            if (remainder < 0) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}