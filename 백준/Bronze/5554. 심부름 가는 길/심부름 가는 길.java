import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 첫 번째 줄에 집에서 학교까지의 이동 시간을 나타내는 초
    int pathA = Integer.parseInt(br.readLine());
    //두 번째 줄에 학교에서 PC방까지의 이동 시간을 나타내는 초
    int pathB = Integer.parseInt(br.readLine());
    //세 번째 줄에 PC방에서 학원까지의 이동 시간을 나타내는 초
    int pathC = Integer.parseInt(br.readLine());
    //마지막 줄에 학원에서 집까지의 이동 시간을 나타내는 초
    int pathD = Integer.parseInt(br.readLine());

    int path = pathA + pathB + pathC + pathD;
    int hour = path / 60;
    int min = path % 60;
    bw.write(hour + "\n" + min + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
