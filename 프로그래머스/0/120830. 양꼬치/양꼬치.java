class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        if (service != 0) {
            k -= service;
        }
        int answer = 12000*n + 2000*k;
        return answer;
    }
}