import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    List<String> wordList = new ArrayList<>();

    // 길이가 M 이상인 단어만 암기
    for (int i = 0; i < N; i++) {
      String word = br.readLine();
      if (word.length() >= M) {
        wordList.add(word);
      }
    }

    // 단어별 빈도수 측정
    Map<String, Integer> wordMap = new HashMap<>();
    for (int i = 0; i < wordList.size(); i++) {
      if (wordMap.containsKey(wordList.get(i))) {
        wordMap.replace(wordList.get(i), wordMap.get(wordList.get(i)) + 1);
      } else {
        wordMap.put(wordList.get(i), 1);
      }
    }

    List<String> words = new ArrayList<>(wordMap.keySet());

    Collections.sort(words, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        // 자주 등장하는 단어 순서대로 정렬
        if (Integer.compare(wordMap.get(o1), wordMap.get(o2)) != 0) {
          return Integer.compare(wordMap.get(o2), wordMap.get(o1));
        }
        // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
        if (o1.length() != o2.length()) {
          return o2.length() - o1.length();
        }
        // 등장 횟수와 길이가 같으면 사전 순으로 정렬
        return o1.compareTo(o2);
      }
    });

    for (String word : words) {
      bw.write(word+ "\n");
    }

    br.close();

    bw.flush();
    bw.close();
  }


// 내가 짠 코드,, 너무나도 analog식.. 심지어 안 돌아간다.. 나중에 다시 도전..
/*  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    List<String> wordList = new ArrayList<>();

    // 길이가 M 이상인 단어만 암기
    for (int i = 0; i < N; i++) {
      String word = br.readLine();
      if (word.length() >= M) {
        wordList.add(word);
      }
    }

    // 단어별 빈도수 측정
    Map<String, Integer> wordMap = new HashMap<>();
    for (int i = 0; i < wordList.size(); i++) {
      if (wordMap.containsKey(wordList.get(i))) {
        wordMap.replace(wordList.get(i), wordMap.get(wordList.get(i))+1);
      } else {
        wordMap.put(wordList.get(i), 1);
      }
    }

    String[] wordListByFrequency = new String[wordMap.size()];

    Iterator<String> keys = wordMap.keySet().iterator();
    for (int i = 0; i < wordMap.size(); i++) {
      wordListByFrequency[i] = keys.next();
    }

    for (int i = 0; i < wordListByFrequency.length-1; i++) {
      // wordList 우선순위 1: 자주 나오는 단어일수록 앞에 배치한다.
      if (wordMap.get(wordListByFrequency[i]) < wordMap.get(wordListByFrequency[i+1])) {
        String frequencyTemp = wordListByFrequency[i];
        wordListByFrequency[i] = wordListByFrequency[i+1];
        wordListByFrequency[i+1] = frequencyTemp;
      }
      // 만약 빈도수가 같으면
      else if (wordMap.get(wordListByFrequency[i]).equals(wordMap.get(wordListByFrequency[i+1]))) {
        // wordList 우선순위 2: 해당 단어의 길이가 길수록 앞에 배치한다.
        if (wordListByFrequency[i].length() < wordListByFrequency[i+1].length()) {
          String lengthTemp = wordListByFrequency[i];
          wordListByFrequency[i] = wordListByFrequency[i+1];
          wordListByFrequency[i+1] = lengthTemp;
        }
        // 만약 단어의 길이가 같다면
        else if (wordListByFrequency[i].length() == wordListByFrequency[i+1].length()) {
          // wordList 우선순위 3: 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다.
          for (int j = 0; j < wordListByFrequency[i].length(); j++) {
            if ((int) wordListByFrequency[i].charAt(i) < (int) wordListByFrequency[i+1].charAt(i)) {
              String alphabetTemp = wordListByFrequency[i];
              wordListByFrequency[i] = wordListByFrequency[i+1];
              wordListByFrequency[i+1] = alphabetTemp;
            }
          }
        }
      }
    }

    for (String word : wordListByFrequency) {
      bw.write(word+ "\n");
    }

    br.close();

    bw.flush();
    bw.close();
  }*/
}