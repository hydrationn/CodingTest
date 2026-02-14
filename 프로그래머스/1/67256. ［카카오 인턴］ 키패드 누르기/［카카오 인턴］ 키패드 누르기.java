import java.util.Map;
import java.util.HashMap;

class Solution {
    public String answer = "";
    public int left = 10;
    public int right = 12;

    public String solution(int[] numbers, String hand) {
        Map<Integer, int[]> map = new HashMap<>();

        // 1~9 좌표 세팅
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map.put(num++, new int[]{i, j});
            }
        }
        // * 0 # 좌표 세팅
        map.put(10, new int[]{3, 0});
        map.put(11, new int[]{3, 1});
        map.put(12, new int[]{3, 2});

        for (int i = 0; i < numbers.length; i++) {
            int order = numbers[i];
            
            if (order == 0) {
                order = 11;
            }

            if (order == 1 || order == 4 || order == 7) {
                clickLeft(order);
            } else if (order == 3 || order == 6 || order == 9) {
                clickRight(order);
            } else {
                int[] orderArr = map.get(order);
                int[] leftArr = map.get(left);
                int[] rightArr = map.get(right);

                int distanceL = Math.abs(leftArr[0] - orderArr[0]) + Math.abs(leftArr[1] - orderArr[1]);
                int distanceR = Math.abs(rightArr[0] - orderArr[0]) + Math.abs(rightArr[1] - orderArr[1]);

                if (distanceL < distanceR) {
                    clickLeft(order);
                } else if (distanceL > distanceR) {
                    clickRight(order);
                } else {
                    if (hand.equals("left")) clickLeft(order);
                    else clickRight(order);
                }
            }
        }

        return answer;
    }

    public void clickLeft(int order) {
        answer += "L";
        left = order;
    }

    public void clickRight(int order) {
        answer += "R";
        right = order;
    }
}