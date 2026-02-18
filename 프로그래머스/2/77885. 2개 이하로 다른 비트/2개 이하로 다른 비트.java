class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long standard = numbers[i];

            String target = Long.toBinaryString(numbers[i]);

            // 짝수 처리
            if (standard % 2 == 0) {
                answer[i] = standard + 1;
                continue;
            }

            // 홀수 처리
            StringBuilder sb = new StringBuilder("0" + target);

            // 뒤에서 첫 0 찾아 변환
            for (int j = sb.length()-1; j >= 0; j--) {
                if (sb.charAt(j) == '0') {
                    sb.setCharAt(j, '1');
                    sb.setCharAt(j+1, '0');
                    break;
                }
            }

            answer[i] = Long.parseLong(sb.toString(), 2);
        }

        return answer;
    }
}
