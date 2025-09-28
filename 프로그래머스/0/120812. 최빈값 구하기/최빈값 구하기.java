import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (intMap.containsKey(array[i])) {
                intMap.replace(array[i], intMap.get(array[i]) + 1);
            } else {
                intMap.put(array[i], 1);
            }
        }

        int max = 0;
        for (int cnt : intMap.values()) {
            if (cnt > max) {
                max = cnt;
            }
        }

        List<Integer> intList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : intMap.entrySet()) {
            if (e.getValue() == max) {
                intList.add(e.getKey());
            }
        }

        if (intList.size() != 1) {
            return -1;
        }
        return intList.get(0);
    }
}