class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int boardMinX = 0;
        int boardMinY = 0;
        int boardMaxX = board[0] - 1;
        int boardMaxY = board[1] - 1;
        int boardCenterX = board[0] / 2;
        int boardCenterY = board[1] / 2;
        
        int currentX = boardCenterX;
        int currentY = boardCenterY;
        for (int i = 0; i < keyinput.length; i++) {
            String move = keyinput[i];
            
            switch(move) {
                case "up":
                    if (currentY < boardMaxY) {
                        currentY++;
                    }
                    break;
                case "down":
                    if (currentY > boardMinY) {
                        currentY--;
                    }
                    break;
                case "left":
                    if (currentX > boardMinX) {
                        currentX--;
                    }
                    break;
                case "right":
                    if (currentX < boardMaxX) {
                        currentX++;
                    }
                    break;
            }
        }
        
        if (currentX <= boardCenterX) {
            answer[0] = currentX - boardCenterX;
        } else {
            answer[0] = boardCenterX - currentX;
        }
        
        answer[0] = currentX - boardCenterX;
        answer[1] = currentY - boardCenterY;
        
        return answer;
    }
}