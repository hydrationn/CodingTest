class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            int day = startday;
            boolean lazy = false;
            
            int safeTime = schedules[i] + 10;
            if (safeTime % 100 >= 60) {
                int min = safeTime % 100 % 60;
                int hour = safeTime / 100 + 1;
                
                if (hour >= 24) {
                    hour %= 24;
                }
                
                safeTime = hour * 100 + min;
            }
            
            
            
            for (int j = 0; j < timelogs[i].length; j++) {
                if (day == 6) {
                    day++;
                    continue;
                } else if (day == 7) {
                    day = 1;
                    continue;
                }
                
                if (timelogs[i][j] > safeTime) {
                    lazy = true;
                }
                day++;
            }
            
            if (!lazy) {
                answer++;
            }
        }
        return answer;
    }
}