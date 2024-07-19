import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();

    int totalPrice = 0;

    for (int i = 1; i <= n; i++) {
      int price = sc.nextInt();
      int num = sc.nextInt();

      totalPrice += price * num;
    }

    if (x == totalPrice) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}