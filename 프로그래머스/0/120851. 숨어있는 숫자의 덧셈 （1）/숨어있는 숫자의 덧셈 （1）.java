class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            char isNum = my_string.charAt(i);
            if (Character.isDigit(isNum)) {
                answer += Character.getNumericValue(isNum);
                // answer += isNum - '0'; // -48 (ASCII code 사용)
            }
        }
        return answer;
    }
}