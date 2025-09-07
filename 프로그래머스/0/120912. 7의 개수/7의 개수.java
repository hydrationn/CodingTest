class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String arrayStr = "";
        for (int n : array) {
            arrayStr += String.valueOf(n);
        }
        
        for (int i=0; i < arrayStr.length(); i++) {
            if ("7".equals(String.valueOf(arrayStr.charAt(i)))) {
                answer++;
            }
        }
        return answer;
    }
}