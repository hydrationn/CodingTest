import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);
            
            stack.clear();
            boolean ok = true;
            
            for (int j = 0; j < s.length(); j++) {
                char c = str.charAt(j);

                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c); // 여는 괄호는 스택에 추가
                } else {
                    // 닫는 괄호인데 스택이 비어있으면 짝이 맞지 않음
                    if (stack.isEmpty()) {
                        ok = false;
                        break;
                    }
                    
                    if (map.get(stack.peek()) == c) {
                        stack.pop(); // 짝이 맞는 여는 괄호 제거
                    } else {
                        ok = false;
                        break;
                    }
                }
            }
            
            if (ok && stack.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}