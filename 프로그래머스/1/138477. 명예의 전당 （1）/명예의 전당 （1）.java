import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            pQ.offer(score[i]);
            
            if (i >= k) {
                pQ.poll();
            }
            
            answer[i] = pQ.element();
        }
        
        return answer;
    }
}