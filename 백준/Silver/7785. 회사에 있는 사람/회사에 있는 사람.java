import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    Set<String> company = new HashSet<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      String employee = String.valueOf(st.nextToken());
      String moment = String.valueOf(st.nextToken());

      if (moment.equals("enter")) {
        company.add(employee);
      } else {
        company.remove(employee);
      }
    }

    List<String> employeeInCompany = new ArrayList<>(company);
    Collections.sort(employeeInCompany, Collections.reverseOrder());

    for (String employee : employeeInCompany) {
      System.out.println(employee);
    }

    br.close();
  }
}
