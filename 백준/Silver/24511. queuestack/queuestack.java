import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] dsArr = new int[N];
    int[] intArr = new int[N];

    StringBuilder answer = new StringBuilder();

    // dataStructure 입력 받기
    StringTokenizer dsTokenizer = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      dsArr[i] = Integer.parseInt(dsTokenizer.nextToken());
    }
    
    // input 초기 배열 입력 받기
    StringTokenizer intTokenizer = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      intArr[i] = Integer.parseInt(intTokenizer.nextToken());
    }

    int M = Integer.parseInt(br.readLine());
    int[] insertList = new int[M];
    
    // 추가 input 배열 입력 받기
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      insertList[i] = Integer.parseInt(st.nextToken());
    }

    Deque<Integer> intDeque = new ArrayDeque<>();
    
    for (int i = 0; i < N; i++) {
      // Queue면 0, Stack이면 1
      if (dsArr[i] == 0) {
        intDeque.addFirst(intArr[i]);
      }
    }
    
    for (int i = 0; i < M; i++) {
      intDeque.add(insertList[i]);
      answer.append((intDeque.pollFirst() + " "));
    }
    
    System.out.println(answer);
    
    br.close();
  }
}


/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// 시간 초과 코드 ㅜ.ㅜ
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    int[] dsArr = new int[N];
    Deque<Integer>[] intDeque = new ArrayDeque[N];

    // dataStructure 입력 받기
    StringTokenizer dsTokenizer = new StringTokenizer(br.readLine());
    // input 초기 배열 입력 받기
    StringTokenizer intTokenizer = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      dsArr[i] = Integer.parseInt(dsTokenizer.nextToken());
      intDeque[i] = new ArrayDeque<>();
      intDeque[i].add(Integer.parseInt(intTokenizer.nextToken()));
    }

    int M = Integer.parseInt(br.readLine());

    // 추가 input 배열 입력 받기
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < M; i++) {
      int input = Integer.parseInt(st.nextToken());

      for (int j = 0; j < N; j++) {
        // Queue면 0, Stack이면 1
        // Queue에 대해서만 배열 안의 숫자가 바뀌고, Stack은 그대로
        if (dsArr[j] == 0) {
          int tmp = intDeque[j].removeFirst();
          intDeque[j].addLast(input);
          input = tmp;
        } else {
          intDeque[j].addFirst(input);
          input = intDeque[j].removeFirst();
        }
      }
      sb.append(input).append(" ");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}*/
