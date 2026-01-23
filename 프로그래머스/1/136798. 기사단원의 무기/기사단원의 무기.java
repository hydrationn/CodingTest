class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] intArr = new int[number];
        
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    intArr[i-1]++;
                } else if (i % j == 0) {
                    intArr[i-1] += 2;
                }
            }
        }
        
        for (int i = 0; i < number; i++) {
            if(intArr[i] > limit) {
                answer += power;
            } else {
                answer += intArr[i];
            }
        }
        
        return answer;
    }
}