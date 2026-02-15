import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int n = board.length;
        int[][] dolls = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dolls[i][j] = board[i][j];
            }
        }
        
        Stack<Integer> game = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int order = moves[i]-1;
            int idx = 0;
            
            while (idx < n && dolls[idx][order] == 0) {
                idx++;
            }
            
            if (idx == n) {
                continue;
            }

            int doll = dolls[idx][order];
            dolls[idx][order] = 0;

            if (!game.isEmpty() && game.peek() == doll) {
                game.pop();
                answer += 2;
            } else {
                game.push(doll);
            }
        }
        
        return answer;
    }
}