class Solution {
    public String solution(String my_string) {
        String[] removeArray = {"a", "e", "i", "o", "u"};
        String answer = my_string;
        
        for(int i = 0; i < removeArray.length; i++) {
            answer = answer.replace(removeArray[i], "");
        }
        return answer;
    }
}