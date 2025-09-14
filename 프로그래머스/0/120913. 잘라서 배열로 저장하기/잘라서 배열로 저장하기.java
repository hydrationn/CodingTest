class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int chunks = (len + n - 1) / n; // 올림
        String[] answer = new String[chunks];

        for (int i = 0; i < chunks; i++) {
            int start = i * n;
            int end = Math.min(start + n, len);
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}