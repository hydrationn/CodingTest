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

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    String str1 = String.valueOf(st.nextToken());
    String str2 = String.valueOf(st.nextToken());

    int num1 = 0;
    int num2 = 0;

    for (int i = 0; i < 2; i++) {
      String n1 = "";
      String n2 = "";

      for (int j = 2; j >= 0; j--) {
        n1 += str1.charAt(j);
        n2 += str2.charAt(j);
      }

      num1 = Integer.parseInt(n1);
      num2 = Integer.parseInt(n2);
    }

    if (num1 > num2) {
      bw.write(String.valueOf(num1));
    } else {
      bw.write(String.valueOf(num2));
    }

    bw.write("\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
