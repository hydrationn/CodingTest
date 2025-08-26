import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String myString = my_string.toLowerCase();
        
        char[] chArr = myString.toCharArray();
        Arrays.sort(chArr);
        
        String answer = new String(chArr);
        return answer;
    }
}