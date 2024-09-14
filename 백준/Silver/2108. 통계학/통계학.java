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

    // 원소와 원소의 개수 값 setting(intMap, reverseIntMAp)
    for (int i = 0; i < N; i++) {
      if (intMap.containsKey(intArr[i])) {
        intMap.replace(intArr[i], intMap.get(intArr[i])+1);
      } else {
        intMap.put(intArr[i], 1);
      }
    }

    // medianMin 값 setting
    int medianMaxCnt = 0;
    for (int i = 0; i < N; i++) {
      if (medianMaxCnt < intMap.get(intArr[i])) {
        medianMaxCnt = intMap.get(intArr[i]);
      }
    }

    // medianMaxCnt가 최대인 값들을 medianSearchList에 add시켜 조건에 맞는 median이 될 후보 만들기
    List<Integer> medianSearchList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      if (intMap.get(intArr[i]).equals(medianMaxCnt) && !medianSearchList.contains(intArr[i])) {
        medianSearchList.add(intArr[i]);
      }
    }
    Collections.sort(medianSearchList);

    // case 1 : 최빈값이 2개 이상인 경우
    // case 2 : 최빈값이 단 하나인 경우
    int second;
    if (medianSearchList.size() >= 2) {
      System.out.println(medianSearchList.get(1));
    } else {
      System.out.println(medianSearchList.get(0));
    }

    // 범위: N개의 수들 중 최댓값과 최솟값의 차이
    int range = intArr[N-1] - intArr[0];
    System.out.println(range);

    br.close();
  }
}
