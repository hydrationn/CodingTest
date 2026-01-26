class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int mid = total / num;
        int gap = num / 2;
        
        if (num % 2 == 0) {
            gap--;
        }
        
        int j = gap;
        
        int idx = 0;
        while (j > 0) {
            answer[idx] = mid - j;
            idx++;
            j--;
        }
        
        while(idx <= num-1) {
            answer[idx] = mid + j;
            idx++;
            j++;
        }
        
        return answer;
    }
}