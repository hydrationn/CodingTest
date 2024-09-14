import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[] intArr = new int[N];

    for (int i = 0; i < N; i++) {
      intArr[i] = Integer.parseInt(br.readLine());
    }

    // list 오름차순 정렬
    Arrays.sort(intArr);

    // 산술평균: N개의 수들의 합을 N으로 나눈 값 -> 소수점 이하 첫째 자리에서 반올림한 값
    double sum = 0;
    for (int i = 0; i < N; i++) {
      sum += intArr[i];
    }
    double average = sum / N;
    System.out.println((int) Math.round(average));

    // 중앙값: N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
    int median = 0;
    if (N % 2 == 0) {
      median = (intArr[N/2-1] +intArr[N/2]) / 2;
    } else {
      median = intArr[N/2];
    }
    System.out.println(median);

    // 최빈값: N개의 수들 중 가장 많이 나타나는 값 -> 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값
    Map<Integer, Integer> intMap = new HashMap<>();

    // 원소와 빈도수 설정
    for (int i = 0; i < N; i++) {
      intMap.put(intArr[i], intMap.getOrDefault(intArr[i], 0) + 1);
    }

    // 가장 높은 빈도를 찾기
    int maxFrequency = Collections.max(intMap.values());

    // 최빈값 리스트 생성
    List<Integer> modeList = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
      if (entry.getValue() == maxFrequency) {
        modeList.add(entry.getKey());
      }
    }

    // 정렬하여 최빈값 중 두 번째로 작은 값 찾기
    Collections.sort(modeList);
    if (modeList.size() > 1) {
      System.out.println(modeList.get(1));  // 두 번째로 작은 최빈값
    } else {
      System.out.println(modeList.get(0));  // 최빈값이 하나일 경우
    }

    // 범위: N개의 수들 중 최댓값과 최솟값의 차이
    int range = intArr[N-1] - intArr[0];
    System.out.println(range);

    br.close();
  }
}
