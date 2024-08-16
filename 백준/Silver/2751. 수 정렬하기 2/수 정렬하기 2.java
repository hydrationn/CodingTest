import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] intArr = new int[n];

    for (int i = 0; i < n; i++) {
      intArr[i] = Integer.parseInt(br.readLine());
    }

    // quick Sort
//    quickSort(intArr, 0, intArr.length-1);

    Arrays.sort(intArr);
    for (int i : intArr) {
      bw.write(i + "\n");
    }
    br.close();

    bw.flush();
    bw.close();
  }

  public static void quickSort(int[] intArr, int start, int finish) {
    if (start >= finish) {
      return;
    }

    int pivot = start;
    int left = start + 1;
    int right = finish;

    while (left <= right) {
      while(left <= finish && intArr[left] <= intArr[pivot])
        left++;

      while(right > start && intArr[right] >= intArr[pivot])
        right--;

      int temp = intArr[right];

      if (left > right) {
        intArr[right] = intArr[pivot];
        intArr[pivot] = temp;
      } else {
        intArr[right] = intArr[left];
        intArr[left] = temp;
      }
    }

    quickSort(intArr, start, right -1);
    quickSort(intArr, right + 1, finish);
  }
}
