import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    int[] intArr = new int[N];
    Stack<Integer> intStack = new Stack<>();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      intArr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i<N; i++) {

      while (!intStack.isEmpty() && intArr[intStack.peek()] < intArr[i]){
        intArr[intStack.pop()] = intArr[i];
      }
      intStack.add(i);
    }

    while(!intStack.isEmpty())
      intArr[intStack.pop()] = -1;

    for(int i = 0; i < N; i++)
      sb.append(intArr[i]).append(" ");

    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }


  /*// 아날로그적으로 배열로 풀었으나 시간 초과 . .
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    
    int N = Integer.parseInt(br.readLine());
    int[] intArr = new int[N];
    
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      intArr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < N; i++) {
      int num = intArr[i];

      int j = i + 1;

      while (true) {
        int NGE;

        if (j > intArr.length-1) {
          sb.append(-1).append(" ");
          break;
        }
        else {
          if (num < intArr[j]) {
            NGE = intArr[j];
            sb.append(NGE).append(" ");
            break;
          } else {
            j++;
          }
        }
      }
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }*/
}
