import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int[] intArr = array;
        Arrays.sort(intArr);
        
        int answer = 0;
        int arrLength = intArr.length;
        if (arrLength % 2 == 0) {
            answer = intArr[arrLength/2-1];
        } else {
            answer = intArr[arrLength/2];
        }
        
        return answer;
    }
}