class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0, mart = 0, remainN = 0, total = 0;
        
        mart = n / a * b;
        remainN = n % a + mart;
        total = n - n/a*a + mart;
        answer += mart;
        
        while (total >= a) {
            mart = total / a * b;
            remainN = total % a + mart;
            total = total - total/a*a + mart;
            answer += mart;
        }
        
        return answer;
    }
}