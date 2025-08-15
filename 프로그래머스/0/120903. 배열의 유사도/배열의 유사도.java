class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i = 0; i < s1.length-1; i++) {
            for(int j = 0; i < s2.length-1; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}