import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Set<Character> wordSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!wordSet.contains(ch)) {
                answer[i] = -1;
                wordSet.add(ch);
            } else {
                int cnt = 1;
                char order = s.charAt(i-cnt);
                while (order != ch &&  i >= cnt) {
                    cnt++;
                    order = s.charAt(i-cnt);
                }
                
                answer[i] = cnt;
            }
        }
        return answer;
    }
}