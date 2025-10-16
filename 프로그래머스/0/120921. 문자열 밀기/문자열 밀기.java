class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        int aLength = A.length();
        String aA = A;
        String a = "";
        
        if (A.equals(B)) {
            return answer;
        }
        
        for (int i = 0; i < aLength; i++) {
            a = String.valueOf(aA.charAt(aLength-1)) + aA.substring(0, aLength-1);
            
            
            if (a.equals(B)) {
                answer = i + 1;
                return answer;
            }
            
            aA = a;
        }
        
        if (answer == 0) {
            answer = -1;
        }
        
        return answer;
    }
}