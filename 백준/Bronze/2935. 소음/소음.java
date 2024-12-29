import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String A = br.readLine();
    String operator = br.readLine();
    String B = br.readLine();

    String result;
    int num = A.length() - B.length();
    if (operator.equals("+")) {
      if (num > 0)
        result = A.substring(0, num) + "1" + A.substring(num+1);
      else if (num == 0)
        result = "2" + A.substring(1);
      else
        result = B.substring(0, -num) + "1" + B.substring(-num+1);
    } else {
      int length = A.length() + B.length() - 2;
      result = "1" + "0".repeat(length);
    }
    bw.write(result + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}