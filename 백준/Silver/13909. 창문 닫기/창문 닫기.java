import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    /*// Wow.. 아래 코드를 통해 출력하고 규칙을 찾은 결과 -> 1~N의 제곱수에 해당하는 window만 열려있음을 확인!
    List<Integer> window = new LinkedList<>();

    for (int i = 0; i <= N; i++) {
      window.add(1);
    }

    for (int i = 2; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (j % i == 0) {
          if (window.get(j) == 1)
            window.set(j, 0);
          else
            window.set(j, 1);
        }
      }

      System.out.println(window.toString());
    }

    int openedWindow = 0;
    for (int i = 0; i < N; i++) {
      if (window.get(i) == 1)
        openedWindow++;
    }
    bw.write(openedWindow-1 + "\n");*/

//    // 1부터 N의 제곱수에 해당하는 index들만 열려있는 창문
//    int cnt = 1;
//    int openedWindow = 0;
//    while (cnt * cnt <= N) {
//      openedWindow++;
//      cnt++;
//    }
//    bw.write(openedWindow + "\n");
    
    // 또는 매우 간단하게 N에 루트만 씌우면 된다..!
    bw.write((int) Math.sqrt(N) +"\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
