import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[] intArrN = new int[N];
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      intArrN[i] = Integer.parseInt(st.nextToken());
    }

    // 이진 탐색을 위한 정렬
    Arrays.sort(intArrN);

    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < M; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (binarySearch(intArrN, num)) {
        bw.write("1 ");
      } else {
        bw.write("0 ");
      }
    }
    bw.write("\n");

    br.close();
    bw.flush();
    bw.close();
  }

  public static boolean binarySearch (int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid] == key) {
        return true;
      } else if (arr[mid] < key) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return false;
  }
}


/* // 브루트포스(Brute Force) 방식
public class Main1181 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[] intArrN = new int[N];
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      intArrN[i] = Integer.parseInt(st.nextToken());
    }

    int M = Integer.parseInt(br.readLine());
    int[] intArrM = new int[M];
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < M; i++) {

      intArrM[i] = Integer.parseInt(st.nextToken());
    }

    int[] intArr = new int[M];

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (intArrM[i] == intArrN[j]) {
          intArr[i] = 1;
        }
      }
    }

    for (int i = 0; i < M; i++) {
      bw.write(intArr[i] + " ");
    }
    bw.write("\n");
    bw.write("\n");
    
    br.close();
    bw.flush();
    br.close();
  }
}
*/
