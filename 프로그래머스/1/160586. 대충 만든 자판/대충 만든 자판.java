class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int total = 0;

            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);
                String alphabet = String.valueOf(ch);

                int minCnt = Integer.MAX_VALUE;

                for (int k = 0; k < keymap.length; k++) {
                    int idx = keymap[k].indexOf(alphabet);
                    if (idx != -1 && idx + 1 < minCnt) {
                        minCnt = idx + 1;
                    }
                }

                if (minCnt == Integer.MAX_VALUE) {
                    total = -1;
                    break;
                }

                total += minCnt;
            }

            answer[i] = total;
        }

        return answer;
    }
}
