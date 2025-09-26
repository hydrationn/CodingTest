import java.util.StringTokenizer;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int answer = Integer.parseInt(st.nextToken());
        
        while (st.hasMoreTokens()) {
            String op = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (op.equals("+")) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        return answer;
    }
}