import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> strQueue1 = new LinkedList<>();
        Queue<String> strQueue2 = new LinkedList<>();
        
        for(int i = 0; i < cards1.length; i++) {
            strQueue1.add(cards1[i]);
        }
        
        for(int i = 0; i < cards2.length; i++) {
            strQueue2.add(cards2[i]);
        }
        
        String answer = "Yes";
        for(int i = 0; i < goal.length; i++) {
            if (!strQueue1.isEmpty() && strQueue1.peek().equals(goal[i])) {
                strQueue1.poll();
            } else if (!strQueue2.isEmpty() && strQueue2.peek().equals(goal[i])) {
                strQueue2.poll();
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}