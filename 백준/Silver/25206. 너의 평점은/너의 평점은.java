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
    StringTokenizer st;

    double sum = 0.0;
    int credit = 0;

    String line;
    while ((line = br.readLine()) != null && !line.isEmpty()) {
      st = new StringTokenizer(line);

      String subject = String.valueOf(st.nextToken());
      double score = Double.parseDouble(st.nextToken());
      String grade = String.valueOf(st.nextToken());

      switch (grade) {
        case "A+":
          sum += score * 4.5;
          credit += score;
          break;
        case "A0":
          sum += score * 4.0;
          credit += score;
          break;
        case "B+":
          sum += score * 3.5;
          credit += score;
          break;
        case "B0":
          sum += score * 3.0;
          credit += score;
          break;
        case "C+":
          sum += score * 2.5;
          credit += score;
          break;
        case "C0":
          sum += score * 2.0;
          credit += score;
          break;
        case "D+":
          sum += score * 1.5;
          credit += score;
          break;
        case "D0":
          sum += score * 1.0;
          credit += score;
          break;
        case "F":
          sum += score * 0.0;
          credit += score;
          break;
        case "P":
          break;
      }
    }

    double avg = sum / credit;
    br.close();

    bw.write(String.format("%6f", avg) + "\n");
    bw.close();
  }
}
