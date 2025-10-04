import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        String answer = s;
        
        Map<String, String> intRule = new HashMap<>();
        intRule.put("zero", "0");
        intRule.put("one", "1");
        intRule.put("two", "2");
        intRule.put("three", "3");
        intRule.put("four", "4");
        intRule.put("five", "5");
        intRule.put("six", "6");
        intRule.put("seven", "7");
        intRule.put("eight", "8");
        intRule.put("nine", "9");
        
        for (String key : intRule.keySet()) {
            if (s.contains(key)) {
                answer = answer.replace(key, intRule.get(key));
            }
        }
        return Integer.parseInt(answer);
    }
}