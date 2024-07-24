import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    String[] arr = str.split(" ");

    String s = String.valueOf(str.charAt(0));
    int num = arr.length;
    if(num == 0) {
      num = 0;
    } else if (s.equals(" ")) {
      num--;
    }

    bw.write(num + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
