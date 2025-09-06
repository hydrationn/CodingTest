import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> sMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            sMap.put(target, sMap.getOrDefault(target, 0)+1);
        }
        
        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}