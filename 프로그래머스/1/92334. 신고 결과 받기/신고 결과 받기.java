import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.List;
import java.util.LinkedList;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        int[] answer = new int[len];
        
        int[][] idArr = new int[len][len];
        Map<String, Integer> idMap = new HashMap<>();
        
        for (int i = 0; i < len; i++) {
            idMap.put(id_list[i], i);
        }
        
        StringTokenizer st;
        for (int i = 0; i < report.length; i++) {
            st = new StringTokenizer(report[i]);
            
            String userId = st.nextToken();
            String reportId = st.nextToken();
            idArr[idMap.get(userId)][idMap.get(reportId)]++;
        }
        
        List<Integer> idList = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            idList.clear();
            
            int cnt = 0;
            for (int j = 0; j < len; j++) {
                if (idArr[j][i] >= 1) {
                    idList.add(j);
                    cnt++;
                }
            }
            
            if (cnt >= k) {
                while (idList.size() > 0) {
                    answer[idList.remove(0)]++;
                }
            }
        }
        
        return answer;
    }
}