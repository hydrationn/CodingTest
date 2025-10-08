class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] sum = new int[n];

        // 두 과목 합
        for (int i = 0; i < n; i++) {
            sum[i] = score[i][0] + score[i][1];
        }

        // 자기보다 합이 큰 사람 수 + 1 = 등수
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (sum[j] > sum[i]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }
}
