import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static class Member {
        String name;
        int[] date = new int[3];

        Member(String name, int year, int month, int day) {
            this.name = name;
            this.date[0] = year;
            this.date[1] = month;
            this.date[2] = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            members[i] = new Member(name, year, month, day);
        }

        Arrays.sort(members, (a, b) -> {
            if (a.date[0] != b.date[0]) {
                return a.date[0] - b.date[0]; // year 오름차순
            }
            if (a.date[1] != b.date[1]) {
                return a.date[1] - b.date[1]; // month 오름차순
            }
            return a.date[2] - b.date[2]; // month 오름차순
        });

        bw.write(members[n-1].name + "\n");
        bw.write(members[0].name + "\n");
        bw.flush();
        bw.close();
    }
}