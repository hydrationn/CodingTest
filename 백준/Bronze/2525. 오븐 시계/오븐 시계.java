import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    int cookingTime = sc.nextInt();

    int totalMin = h * 60 + m + cookingTime;
    int resultHour = (totalMin/60) % 24;

    int resultMin = totalMin % 60;
    System.out.println(resultHour + " " + resultMin);
  }
}
