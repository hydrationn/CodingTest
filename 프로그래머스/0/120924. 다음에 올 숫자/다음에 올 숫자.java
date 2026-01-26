class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int idx = 1;
        
        int d = common[idx+1] - common[idx];
        int r = 0;
        if (common[idx] == 0) {
            return 0;
        } else {
            r = common[idx+1] / common[idx];
        }
        
        // 등차수열인지 판단
        boolean as = true;
        for (int i = 0; i < 2; i++) {
            if (common[i] != common[i+1] - d) {
                as = false;
                break;
            }
        }

        if (as) { // 등차수열
            answer = common[common.length-1] + d;
        } else { // 등비수열
            answer = common[common.length-1] * r;
        }
        
        return answer;
    }
}