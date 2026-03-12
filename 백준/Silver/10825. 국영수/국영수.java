import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    static class Student {
        String name;
        int[] score = new int[3];

        Student(String name, int korean, int english, int math) {
            this.name = name;
            this.score[0] = korean;
            this.score[1] = english;
            this.score[2] = math;
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students, (a, b) -> {
            if (a.score[0] != b.score[0]) {
                return b.score[0] - a.score[0]; // 국어 내림차순
            }
            if (a.score[1] != b.score[1]) {
                return a.score[1] - b.score[1]; // 영어 오름차순
            }
            if (a.score[2] != b.score[2]) {
                return b.score[2] - a.score[2]; // 수학 내림차순
            }
            return a.name.compareTo(b.name); // 이름 오름차순
        });

        for (int i = 0; i < N; i++) {
            bw.write(students[i].name + "\n");
        }

        bw.flush();
        bw.close();
    }
}