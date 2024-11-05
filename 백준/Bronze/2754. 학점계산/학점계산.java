import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String score = br.readLine();

    double grade = 0;
    switch (score.charAt(0)) {
      case 'A':
        grade = 4;
        break;

      case 'B':
        grade = 3;
        break;

      case 'C':
        grade = 2;
        break;

      case 'D':
        grade = 1;
        break;

      case 'F':
        grade = 0;
        break;
    }

    if (score.length() == 2) {
      switch (score.charAt(1)) {
        case '+':
          grade += 0.3;
          break;

        case '0':
          grade += 0.0;
          break;

        case '-':
          grade -= 0.3;
          break;
      }
    }
    bw.write(grade + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
