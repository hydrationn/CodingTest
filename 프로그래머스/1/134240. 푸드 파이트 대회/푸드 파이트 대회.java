class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        String start = "";
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            
            String strI = "" + i;
            start += strI.repeat(cnt);
        }
        start += "0";
        answer += start;
        
        for (int i = answer.length()-2; i >= 0; i--) {
            answer += start.charAt(i);
        }
        
        return answer;
    }
}