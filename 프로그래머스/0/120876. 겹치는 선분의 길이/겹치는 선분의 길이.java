class Solution {
    public int solution(int[][] lines) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lines.length; i++) {
            min = Math.min(min, lines[i][0]);
            max = Math.max(max, lines[i][1]);
        }

        int[] cnt = new int[max - min];

        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] - min;
            int end = lines[i][1] - min;
            
            for (int x = start; x < end; x++) {
                cnt[x]++;
            }
        }

        int answer = 0;
        for (int c : cnt) {
            if (c >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
}