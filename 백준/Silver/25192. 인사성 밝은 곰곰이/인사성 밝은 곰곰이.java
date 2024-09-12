import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    Set<String> gomgomSet = new HashSet<>();

    int gomgomChat = 0;

    for (int i = 0; i < N; i++) {
      String user = br.readLine();

      if (user.equals("ENTER")) {
        gomgomSet.clear();
        continue;
      }
      else if (gomgomSet.contains(user)) {
        continue;
      } else {
        gomgomSet.add(user);
        gomgomChat++;
      }
    }
    bw.write(gomgomChat + "\n");

    br.close();

    bw.flush();
    bw.close();
  }
}
