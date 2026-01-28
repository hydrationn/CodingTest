class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] strArr = polynomial.split(" \\+ ");
        
        int x = 0, y = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("x")) {
                String rank = strArr[i].replace("x", "");
                
                if (rank.equals("")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(rank);
                }
            } else {
                y += Integer.parseInt(strArr[i]);
            }
        }
        
        if (x == 0) {
            answer += y;
        } else if (y == 0) {
            if (x == 1) {
                answer = "x";
            } else {
                answer = x + "x";
            }
        } else {
            if (x == 1) {
                answer = "x" + " + " + y;
            } else {
                answer = x + "x" + " + " + y;
            }
        }
        
        return answer;
    }
}