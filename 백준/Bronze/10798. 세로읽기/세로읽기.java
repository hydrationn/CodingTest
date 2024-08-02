import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[][] chArr = new char[5][15];
    int max = 0;

    for (int i = 0; i < chArr.length; i++) {
      String line = br.readLine();
      if (max < line.length())
        max = line.length();

      for (int j = 0; j < line.length(); j++) {
        chArr[i][j] = line.charAt(j);
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < max; i++) {
      for (int j = 0; j < 5; j++) {
        if (chArr[j][i] == '\0') {
          continue;
        }
        sb.append(chArr[j][i]);
      }
    }
    System.out.println(sb);
//    bw.write(sb.toString() + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
