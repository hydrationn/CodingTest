import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine().toString();
    int[] arr = new int[26];

    for (int i = 0; i < str.length(); i++) {
      if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
        arr[str.charAt(i) - 'A']++;
      } else {
        arr[str.charAt(i) - 'a']++;
      }
    }

    int max = -1;
    int maxNum = -1;
    boolean sameFrequency = false;

    for (int i = 0; i < 26; i++) {
      if (max < arr[i]) {
        max = arr[i];
        maxNum = i;
        sameFrequency = false;
      } else if (max == arr[i]) {
        sameFrequency = true;
      }
    }

    if (max == -1 || sameFrequency == true) {
      bw.write("?" + "\n");
    } else {
      bw.write((char) (maxNum + 'A') + "\n");
    }
    br.close();

    bw.flush();
    bw.close();
  }
}
