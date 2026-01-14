import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<Integer, String> intMap = new HashMap<>();
        Map<String, Integer> strMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            intMap.put(i, players[i]);
            strMap.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int callMemberNo = strMap.get(callings[i]);
            
            String temp = intMap.get(callMemberNo - 1);
            intMap.replace(callMemberNo - 1, callings[i]);
            intMap.replace(callMemberNo, temp);
            
            strMap.replace(callings[i], callMemberNo - 1);
            strMap.replace(temp, callMemberNo);
        }
        
        String[] answer = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            answer[i] = intMap.get(i);
        }
        
        return answer;
    }
}