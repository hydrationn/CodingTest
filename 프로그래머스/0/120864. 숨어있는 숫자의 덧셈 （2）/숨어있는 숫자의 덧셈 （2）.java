class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String keepInt = "";
        for (int i = 0; i < my_string.length(); i++) {
            Character target = my_string.charAt(i);
            
            if (49 <= target && target <= 57) {
                keepInt += target - 48;
            } else if (target == 48) {
                if (!keepInt.isEmpty()) {
                    keepInt += target - 48;
                }
            }else {
                if (!keepInt.isEmpty()) {
                    answer += Integer.parseInt(keepInt);
                    keepInt = "";
                }
            }
        }
        
        if (!keepInt.isEmpty()) {
            answer += Integer.parseInt(keepInt);
        }
        return answer;
    }
}