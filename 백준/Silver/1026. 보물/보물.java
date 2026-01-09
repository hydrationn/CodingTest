import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    
    int N = Integer.parseInt(br.readLine());

    int[] arrA = new int[N];
    int[] arrB = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arrA[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arrA);

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arrB[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arrB);

    int result = 0;
    for (int i = 0; i < N; i++) {
      result += arrA[i] * arrB[N-i-1];
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}