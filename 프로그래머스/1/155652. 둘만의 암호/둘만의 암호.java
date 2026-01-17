class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char order = s.charAt(i);
            
            int j = 0;
            while (j < index) {
                order++;
                
                if (order > 'z') {
                    order = 'a';
                }
                
                if (skip.contains(String.valueOf(order))) {
                    continue;
                }
                j++;
            }
            answer += order;
        }
        
        return answer;
    }
}