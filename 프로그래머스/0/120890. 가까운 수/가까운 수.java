class Solution {
    public int solution(int[] array, int n) {
        int nearN = Integer.MAX_VALUE;
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            int gap = Math.abs(array[i] - n);
            
            if (nearN > gap) {
                nearN = gap;
                answer = array[i];
            } else if (nearN == gap) {
                if (answer > array[i]) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}