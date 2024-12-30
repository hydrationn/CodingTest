import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken()); // 앨범에 수록된 곡의 개수
    int I = Integer.parseInt(st.nextToken()); // 평균값

    int copyright = A * (I-1);
    
    // 창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수
    bw.write(copyright + 1 + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}