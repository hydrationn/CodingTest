class Solution {
    public String solution(String s) {
        String answer = "";
        boolean start = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer += " ";
                start = true;
            } else {
                if (start) {
                    answer += Character.toUpperCase(c);
                    start = false;
                } else {
                    answer += Character.toLowerCase(c);
                }
            }
        }
        return answer;
    }
}