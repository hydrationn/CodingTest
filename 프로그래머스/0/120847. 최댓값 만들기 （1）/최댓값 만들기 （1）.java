class Solution {
    public int solution(int[] numbers) {
        // Bubble Sort
        /*for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }*/
        
        // Insertion Sort
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && temp > numbers[j]) {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = temp;
        }
        
        int answer = numbers[0] * numbers[1];
        return answer;
    }
}