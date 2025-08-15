import java.util.List;
import java.util.LinkedList;

class Solution {
    public int[] solution(String[] strlist) {
        List<Integer> strLengthList = new LinkedList<>();
        
        for(int i = 0; i < strlist.length; i++) {
            strLengthList.add(strlist[i].length());
        }
        
        int[] answer = strLengthList.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
        
        return answer;
    }
}