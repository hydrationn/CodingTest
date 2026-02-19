import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            orderMap.put(want[i], number[i]);
        }

        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < discount.length; i++) {
            String target = discount[i];

            // 해당하는 날에 대한 할인 품목 추가
            countMap.put(target, countMap.getOrDefault(target, 0) + 1);

            // 10일 넘어가면 품목 제거
            if (i >= 10) {
                String out = discount[i - 10];
                countMap.put(out, countMap.get(out) - 1);
            }

            // check
            if (i >= 9) {
                boolean member = true;

                int idx = 0;
                while (idx < want.length) {
                    String w = want[idx];

                    if (countMap.get(w) == null || countMap.get(w) == 0) {
                        member = false;
                        break;
                    }

                    if (countMap.get(w) < orderMap.get(w)) {
                        member = false;
                        break;
                    }

                    idx++;
                }

                if (member) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
