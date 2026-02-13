
class Solution {
    public int solution(int n) {
        // 10진법 -> 3진법
        String first = Integer.toString(n, 3);
        
        // 앞뒤 반전(3진법)
        String second = new StringBuilder(first).reverse().toString();
        
        // 3진법 -> 10진법
        int answer = Integer.parseInt(second, 3);
        
        return answer;
    }
}