import java.util.Arrays;

class Solution {
    public int solution(int i, int j, int k) {
        String checkStr = "";
        for(int n = i; n <= j; n++) {
            checkStr += n;
        }
        
        char[] checkArr = checkStr.toCharArray();
        Arrays.sort(checkArr);
        
        int answer = 0;
        char target = (char) (k + '0');
        for(int n = 0; n < checkArr.length; n++) {
            if (target == checkArr[n]) {
                answer++;
            }
        }
        
        return answer;
    }
}