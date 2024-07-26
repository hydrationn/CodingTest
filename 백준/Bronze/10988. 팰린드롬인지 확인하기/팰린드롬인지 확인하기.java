import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strArr = sc.next().split("");

    int i = 0;
    int j = strArr.length-1;
    boolean isPalindrome = true;

    while (i < j) {
      if (!strArr[i].equals(strArr[j])) {
        isPalindrome = false;
        break;
      }
      i++;
      j--;
    }

    if (isPalindrome) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
