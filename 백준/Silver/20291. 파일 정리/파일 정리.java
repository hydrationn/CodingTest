import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    Map<String, Integer> fileType = new HashMap<>();

    // fileType 별로 Map(fileType)에 등록
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      String fName = st.nextToken("."); // . 앞부분은 file name에 해당
      String fType = st.nextToken("."); // . 뒷부분은 file type에 해당

      if (!fileType.containsKey(fType)) {
        fileType.put(fType, 1);
      } else {
        fileType.replace(fType, fileType.get(fType)+1);
      }
    }

    // fileType sorting
    List<String> sortFileType = new ArrayList<>(fileType.keySet());
    
    Collections.sort(sortFileType);

    // 출력
    for (String key : sortFileType) {
      sb.append(key + " " + fileType.get(key) + "\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
