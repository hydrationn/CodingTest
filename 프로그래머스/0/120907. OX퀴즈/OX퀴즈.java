import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        StringTokenizer st;
        
        List<String> strList = new ArrayList<>();
        
        for(int i = 0; i < quiz.length; i++) {
            st = new StringTokenizer(quiz[i], "= ");
            
            int op1 = Integer.parseInt(st.nextToken());
            String operation = st.nextToken();
            int op2 = Integer.parseInt(st.nextToken());
            int result = Integer.parseInt(st.nextToken());
            
            if (operation.equals("+")) {
                if (result == op1 + op2) {
                    strList.add("O");
                } else {
                    strList.add("X");
                }
            } else {
                if (result == op1 - op2) {
                    strList.add("O");
                } else {
                    strList.add("X");
                }
            }
        }
        
        int strListSize = strList.size();
        answer = strList.toArray(new String[strListSize]);
        return answer;
    }
}