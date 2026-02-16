import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int[] wArr = new int[sizes.length];
        int[] hArr = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            wArr[i] = Math.max(sizes[i][0], sizes[i][1]);
            hArr[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        Arrays.sort(wArr);
        Arrays.sort(hArr);
        
        int w = wArr[sizes.length-1];
        int h = hArr[sizes.length-1];
        
        answer = w * h;
        
        return answer;
    }
}