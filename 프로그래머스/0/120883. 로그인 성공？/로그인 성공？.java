import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        Map<String, String> members = new HashMap<>();
        for (int i = 0; i < db.length; i++) {
            members.put(db[i][0], db[i][1]);
        }
        
        if (members.containsKey(id_pw[0])) {
            if ((members.get(id_pw[0])).equals(id_pw[1])) {
                answer = "login";
            } else {
                answer = "wrong pw";
            }
        } else {
            answer = "fail";
        }
        return answer;
    }
}