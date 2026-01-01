import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int mDate = Integer.parseInt(st.nextToken());

        int date;
        int cnt = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 2:
                    date = 28;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    date = 30;
                    break;

                default:
                    date = 31;
            }
            cnt += date;
        }
        cnt += (mDate - 1);

        String day;
        cnt %= 7;
        switch (cnt) {
            case 0:
                day = "MON";
                break;
            case 1:
                day = "TUE";
                break;
            case 2:
                day = "WED";
                break;
            case 3:
                day = "THU";
                break;
            case 4:
                day = "FRI";
                break;
            case 5:
                day = "SAT";
                break;
            default:
                day = "SUN";
        }

        bw.write(day + "\n");
        bw.flush();
        bw.close();
    }
}