import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    // N: 브실이가 수강한 과목 수
    int N = Integer.parseInt(st.nextToken());
    // M: 브실대학에서 요구하는 과목 수
    int M = Integer.parseInt(st.nextToken());
    // K: 그리고 브실대학에서 공개한 과목 수
    int K = Integer.parseInt(st.nextToken());

    Map<String, Integer> subjectScore = new HashMap<>();

    // 브실이가 수강한 과목 N개 입력
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String subject = st.nextToken();
      int score = Integer.parseInt(st.nextToken());

      subjectScore.put(subject, score);
    }

    // 브실대학에서 공개한 과목
    int sum = 0;
    for (int i = 0; i < K; i++) {
      String essentialSubject = br.readLine();
      int essentialScore = subjectScore.get(essentialSubject);
      sum += essentialScore;

      // 공개된 과목 제거
      subjectScore.remove(essentialSubject);
    }

    // 남은 과목의 점수만 리스트에 추가
    List<Integer> scoreList = new ArrayList<>(subjectScore.values());
    Collections.sort(scoreList);

    int minSum = sum;
    int maxSum = sum;

    // 남은 과목 중 최소 점수와 최대 점수를 합산
    for (int i = 0; i < Math.min(M - K, scoreList.size()); i++) {
      minSum += scoreList.get(i); // 가장 낮은 점수부터 선택
    }

    for (int i = 0; i < Math.min(M - K, scoreList.size()); i++) {
      maxSum += scoreList.get(scoreList.size() - 1 - i); // 가장 높은 점수부터 선택
    }

    bw.write(minSum + " " + maxSum + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
