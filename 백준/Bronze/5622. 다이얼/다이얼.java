import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] strArr = br.readLine().split("");

    int totalTime = 0;
    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].equals("A") || strArr[i].equals("B") || strArr[i].equals("C"))
        totalTime += 2;
      if (strArr[i].equals("D") || strArr[i].equals("E") || strArr[i].equals("F"))
        totalTime += 3;
      if (strArr[i].equals("G") || strArr[i].equals("H") || strArr[i].equals("I"))
        totalTime += 4;
      if (strArr[i].equals("J") || strArr[i].equals("K") || strArr[i].equals("L"))
        totalTime += 5;
      if (strArr[i].equals("M") || strArr[i].equals("N") || strArr[i].equals("O"))
        totalTime += 6;
      if (strArr[i].equals("P") || strArr[i].equals("Q") || strArr[i].equals("R") || strArr[i].equals("S"))
        totalTime += 7;
      if (strArr[i].equals("T") || strArr[i].equals("U") || strArr[i].equals("V"))
        totalTime += 8;
      if (strArr[i].equals("W") || strArr[i].equals("X") || strArr[i].equals("Y") || strArr[i].equals("Z"))
        totalTime += 9;
    }
    totalTime += strArr.length;

    bw.write(totalTime + "\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
