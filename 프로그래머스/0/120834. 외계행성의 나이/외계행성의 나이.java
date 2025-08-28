class Solution {
    public String solution(int age) {
        String answer = "";
        char[] chArr = new char[4];
        
        int idx = chArr.length-1;
        while (age > 0 && idx >= 0) {
            chArr[idx] = (char) ('a' + (age % 10));
            age /= 10;
            idx--;
        }
        
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] != '\u0000') {
                answer += chArr[i];
            }
        }
        
        return answer;
    }
}