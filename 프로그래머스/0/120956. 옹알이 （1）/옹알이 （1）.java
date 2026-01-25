class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] strArr = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            int cnt = 0;
            
            for (int j = 0; j < strArr.length; j++) {
                if (babbling[i].contains(strArr[j])) {
                    babbling[i] = babbling[i].replace(strArr[j], ".");
                    cnt++;
                }
            }
            
            if (babbling[i].equals((".").repeat(cnt))) {
                answer++;
            }
        }
        
        return answer;
    }
}