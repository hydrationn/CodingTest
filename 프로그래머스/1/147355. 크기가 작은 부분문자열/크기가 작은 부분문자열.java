class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        int startIdx = 0;
        int endIdx = len;
        while (endIdx <= t.length()) {
            String num = t.substring(startIdx, endIdx);
            if (num.compareTo(p) <= 0) {
                answer++;
            }
            
            startIdx++;
            endIdx++;
        }
        
        return answer;
    }
}