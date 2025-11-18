import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input;
        while (!(input = br.readLine()).equals("end")) {
            switch (input) {
                case "animal":
                    sb.append("Panthera tigris").append("\n");
                    break;
                case "flower":
                    sb.append("Forsythia koreana").append("\n");
                    break;
                case "tree":
                    sb.append("Pinus densiflora").append("\n");
                    break;
            }
        }
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}
