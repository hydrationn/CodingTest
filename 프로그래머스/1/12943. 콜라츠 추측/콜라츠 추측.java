class Solution {
    static int cnt = 0;
    
    public int solution(int num) {
        return collatzConjecture(num);
    }
    
    public int collatzConjecture(int num) {
        // 입력된 수, num은 1 이상 8,000,000 미만인 정수이기 때문에 int가 아닌 long으로 선언
        long n = num; 
        
        while (n != 1) {
            cnt++;
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n += 1;
            }
            
            if (cnt == 500) {
                return -1;
            }
        }
        
        return cnt;
    }
}