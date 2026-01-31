class Solution {
    public String solution(String phone_number) {
        int endNumber = phone_number.length() - 4;
        String answer = "*".repeat(endNumber) + phone_number.substring(endNumber);
        return answer;
    }
}