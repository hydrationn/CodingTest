import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        Deque<Integer> intDeque = new ArrayDeque<>();
        
        for (int i = 0; i < numbers.length; i++) {
            intDeque.add(numbers[i]);
        }
        
        if (direction.equals("right")) {
            intDeque.addFirst(intDeque.pollLast());
        } else {
            intDeque.addLast(intDeque.pollFirst());
        }
        
        int size = intDeque.size();
        for (int i = 0; i < size; i++) {
            answer[i] = intDeque.pop();
        }
        
        return answer;
    }
}