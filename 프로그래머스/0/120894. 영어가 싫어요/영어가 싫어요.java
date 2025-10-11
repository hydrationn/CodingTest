class Solution {
    public long solution(String numbers) {
        String result0 = numbers.replace("zero", "0");
        String result1 = result0.replace("one", "1");
        String result2 = result1.replace("two", "2");
        String result3 = result2.replace("three", "3");
        String result4 = result3.replace("four", "4");
        String result5 = result4.replace("five", "5");
        String result6 = result5.replace("six", "6");
        String result7 = result6.replace("seven", "7");
        String result8 = result7.replace("eight", "8");
        String result9 = result8.replace("nine", "9");
        
        long answer = Long.parseLong(result9);
        
        return answer;
    }
}