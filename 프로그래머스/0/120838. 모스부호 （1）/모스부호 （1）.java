import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public String solution(String letter) {
        StringTokenizer st = new StringTokenizer(letter);
        
        String[] morseArr = {".-", "-...", "-.-.", "-..", ".", "..-.",
                             "--.", "....", "..",".---", "-.-", ".-..",
                             "--", "-.", "---", ".--.", "--.-", ".-.",
                             "...", "-", "..-", "...-", ".--", "-..-",
                             "-.--", "--.."};
        
        String answer = "";
        
        int resultLength = st.countTokens();
        for (int i = 0; i < resultLength; i++) {
            String target = st.nextToken();
            
            for (int j = 0; j < morseArr.length; j++) {
                if (morseArr[j].equals(target)) {
                    answer += Character.toString(j + 'a');
                }
            }
        }
        
        return answer;
    }
}