import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        Set<String> myStringSet = new HashSet<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            String target = String.valueOf(my_string.charAt(i));
            
            if (!myStringSet.contains(target)) {
                answer += target;
                myStringSet.add(target);
            }
        }
        
        return answer;
    }
}