class Solution {
    public int[] solution(String s) {
        
        
        String x = s;
        
        int cnt = 0;
        int chance = 0;
        
        while (!x.equals("1")) {
            chance++;
            
            // Step 1: x의 모든 0 제거 -> 제거할 0의 개수 계산
            cnt += x.length() - x.replace("0", "").length();
            x = x.replace("0", "");
            

            // Step 2: x의 길이를 2진법으로 표현한 문자열로 변환
            x = Integer.toBinaryString(x.length());
        }
        
        int[] answer = {chance, cnt};
        
        return answer;
    }
}