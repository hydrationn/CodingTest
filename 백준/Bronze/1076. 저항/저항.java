import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String color;
    String resistance = "";

    // 처음 색 2개는 저항의 값
    for (int i = 0; i < 2; i++) {
      color = br.readLine();

      switch (color) {
        case "black":
          resistance += "0";
          break;
        case "brown":
          resistance += "1";
          break;
        case "red":
          resistance += "2";
          break;
        case "orange":
          resistance += "3";
          break;
        case "yellow":
          resistance += "4";
          break;
        case "green":
          resistance += "5";
          break;
        case "blue":
          resistance += "6";
          break;
        case "violet":
          resistance += "7";
          break;
        case "grey":
          resistance += "8";
          break;
        case "white":
          resistance += "9";
          break;
      }
    }

    // 마지막 색은 곱해야 하는 값
    long resistResult = Long.parseLong(resistance);
    color = br.readLine();

    switch (color) {
      case "black":
        resistResult *= 1;
        break;
      case "brown":
        resistResult *= 10;
        break;
      case "red":
        resistResult *= 100;
        break;
      case "orange":
        resistResult *= 1000;
        break;
      case "yellow":
        resistResult *= 10000;
        break;
      case "green":
        resistResult *= 100000;
        break;
      case "blue":
        resistResult *= 1000000;
        break;
      case "violet":
        resistResult *= 10000000;
        break;
      case "grey":
        resistResult *= 100000000;
        break;
      case "white":
        resistResult *= 1000000000;
        break;
    }
    bw.write(resistResult + "\n");

    bw.flush();
    bw.close();
  }
}