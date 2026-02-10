import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        Set<Integer> winSet = new HashSet<>();
        for (int i = 0; i < win_nums.length; i++) {
            winSet.add(win_nums[i]);
        }
        
        int correct = 0;
        int dontKnow = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (winSet.contains(lottos[i])) {
                correct++;
            } else if (lottos[i] == 0) {
                dontKnow++;
            }
        }
        
        // total(6) = correct + incorrect + dontKnow
        // result(7) = maxCorrect or minCorrect + 등수
        int maxCorrect = correct + dontKnow;
        int minCorrect = correct + 0;
        
        int max, min;
        if (maxCorrect <= 1) {
            max = 6;
        } else {
            max = 7 - maxCorrect;
        }
        
        if (minCorrect <= 1) {
            min = 6;
        } else {
            min = 7 - minCorrect;
        }
        
        answer[0] = Math.min(max, min);
        answer[1] = Math.max(max, min);
        return answer;
    }
}