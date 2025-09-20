import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        Stack<Integer> intStack = new Stack<>();
        
        int cnt = st.countTokens();
        for(int i = 0; i < cnt; i++) {
            String target = st.nextToken();
            
            if (target.equals("Z")) {
                intStack.pop();
            } else {
                intStack.push(Integer.parseInt(target));
            }
        }
        
        int answer = 0;
        while(!intStack.isEmpty()) {
            answer += intStack.pop();
        }
        
        return answer;
    }
}