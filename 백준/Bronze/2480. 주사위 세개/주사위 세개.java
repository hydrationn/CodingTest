import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int money;

    if (a == b && a == c) {
      money = 10000 + a * 1000;
    } else if (a == b && b != c) {
      money = 1000 + a * 100;
    } else if (a != b && b == c) {
      money = 1000 + b * 100;
    } else if (a == c && c != b) {
      money = 1000 + a * 100;
    } else {
      int max = a;
      if (max < b) {
        max = b;
      }
      if (max < c) {
        max = c;
      }
      money = max * 100;
    }

    System.out.println(money);
  }
}