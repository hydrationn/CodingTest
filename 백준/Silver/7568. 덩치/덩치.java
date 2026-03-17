import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static class Human {
        int weight;
        int height;
        int rank;

        Human(int weight, int height, int rank) {
            this.weight = weight;
            this.height = height;
            this.rank = rank;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Human[] humans = new Human[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            humans[i] = new Human(weight, height, 1);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (humans[i].weight > humans[j].weight && humans[i].height > humans[j].height) {
                    humans[j].rank++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(humans[i].rank + " ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}