class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String numStr = Integer.toString(num);
        char[] numArr = numStr.toCharArray();
        
        char target = (char)('0' + k);
        for(int i = 0; i < numStr.length(); i++) {
            if (numArr[i] == target) {
                answer = i + 1;
                break;
            }
        }
        
        if (answer == 0) {
            answer = -1;
        }
        
        // // 방법 2
        // String s = String.valueOf(num);
        // int idx = s.indexOf(String.valueOf(k));  // 첫 등장 위치(0-based), 없으면 -1
        // return (idx == -1) ? -1 : idx + 1;       // 문제 요구대로 1-based로 변환
        return answer;
    }
}