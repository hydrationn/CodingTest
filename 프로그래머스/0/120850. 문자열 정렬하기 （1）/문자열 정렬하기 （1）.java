import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        String[] strArr = my_string.replaceAll("[a-z]","").split("");
        answer = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}