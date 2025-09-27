class Solution {
    public int solution(int[][] dots) {
        int baseStart = Integer.MAX_VALUE;
        int baseEnd = Integer.MIN_VALUE;
        int heightStart = Integer.MAX_VALUE;
        int heightEnd = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            baseStart = Math.min(baseStart, dots[i][0]);
            baseEnd = Math.max(baseEnd, dots[i][0]);
            heightStart = Math.min(heightStart, dots[i][1]);
            heightEnd = Math.max(heightEnd, dots[i][1]);
        }
        
        int answer = (baseEnd-baseStart) * (heightEnd-heightStart);
        return answer;
    }
}