import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();

    int totalMin = h * 60 + m;
    int alarm;

    if (totalMin - 45 < 0) {
      alarm = 24 * 60 - (45-totalMin);
    } else {
      alarm = totalMin - 45;
    }

    int resultHour = alarm / 60;
    int resultMin = alarm % 60;
    System.out.println(resultHour + " " + resultMin);
  }
}