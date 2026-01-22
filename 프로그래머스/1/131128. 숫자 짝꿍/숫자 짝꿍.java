class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[][] intArrXY = new int[10][3];
        
        // X 자릿수 공통인 정수 정리
        for (int i = 0; i < X.length(); i++) {
            int n = X.charAt(i) - '0';
            intArrXY[n][1]++;
        }
        
        // Y 자릿수 공통인 정수 정리
        for (int i = 0; i < Y.length(); i++) {
            int n = Y.charAt(i) - '0';
            intArrXY[n][2]++;
        }
        
        // X, Y 자릿수 공통인 정수 정리
        boolean common = false;
        boolean zero = false;
        for (int i = 0; i < 10; i++) {
            intArrXY[i][0] = Math.min(intArrXY[i][1], intArrXY[i][2]);
            
            if (intArrXY[i][0] != 0) {
                common = true;
            }
        }
        // 공통 숫자가 0만 있는지 확인
        if (common) {
            zero = true;
            for (int i = 1; i < 10; i++) {
                if (intArrXY[i][0] > 0) {
                    zero = false;
                    break;
                }
            }
        }
        
        // 최종 answer 취합
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (intArrXY[i][0] > 0) {
                sb.append(i);
                intArrXY[i][0]--;
            }
        }
        
        if (!common) {
            return "-1";
        }
        
        answer = sb.toString();
        if (zero) {
            return "0";
        }
        
        return answer;
    }
}
