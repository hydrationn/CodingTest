import java.util.Map;
import java.util.HashMap;

class Solution {
    
    
    
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String INDICATOR = "RTCFJMAN";
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < INDICATOR.length(); i++) {
            map.put(INDICATOR.charAt(i), 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            
            int choice = choices[i];
            switch (choice) {
                case 1:
                    map.put(c1, map.get(c1) + 3);
                    break;
                case 2:
                    map.put(c1, map.get(c1) + 2);
                    break;
                case 3:
                    map.put(c1, map.get(c1) + 1);
                    break;
                case 4:
                    break;
                case 5:
                    map.put(c2, map.get(c2) + 1);
                    break;
                case 6:
                    map.put(c2, map.get(c2) + 2);
                    break;
                case 7:
                    map.put(c2, map.get(c2) + 3);
                    break;
            }
        }
        
        for (int j = 0; j < INDICATOR.length()/2; j++) {
            char t1 = INDICATOR.charAt(j*2);
            char t2 = INDICATOR.charAt(j*2+1);

            if (map.get(t1) > map.get(t2)) {
                answer += t1;
            } else if (map.get(t1) < map.get(t2)) {
                answer += t2;
            } else {
                if (t1 < t2) {
                    answer += t1;
                } else {
                    answer += t2;
                }
            }
        }
        
        return answer;
    }
}