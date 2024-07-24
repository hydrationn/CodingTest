import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = br.readLine();

    int[] arr = new int[26];
    for (int i = 0; i < 26; i++) {
      arr[i] = -1;
    }

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if(arr[ch - 'a'] == -1) {
        arr[ch - 'a'] = i;
      }
    }

    for (int i = 0; i < 26; i++) {
      bw.write(arr[i] + " ");
    }
    bw.write("\n");
    br.close();

    bw.flush();
    bw.close();
  }
}
