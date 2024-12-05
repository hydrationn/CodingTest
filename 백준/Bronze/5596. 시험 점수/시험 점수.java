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

    // 민국이의 정보, 수학, 과학, 영어 점수
    int infoS = Integer.parseInt(st.nextToken());
    int mathS = Integer.parseInt(st.nextToken());
    int sciS = Integer.parseInt(st.nextToken());
    int engS = Integer.parseInt(st.nextToken());
    int sumS = infoS + mathS + sciS + engS;

    st = new StringTokenizer(br.readLine());
    // 만세의 정보, 수학, 과학, 영어 점수
    int infoT = Integer.parseInt(st.nextToken());
    int mathT = Integer.parseInt(st.nextToken());
    int sciT = Integer.parseInt(st.nextToken());
    int engT = Integer.parseInt(st.nextToken());
    int sumT = infoT + mathT + sciT + engT;

    if (sumS >= sumT)
      bw.write(sumS + "\n");
    else
      bw.write(sumT + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
