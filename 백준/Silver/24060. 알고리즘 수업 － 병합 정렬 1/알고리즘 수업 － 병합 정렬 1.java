import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static int N;
  public static int K;
  public static int[] A;
  public static int[] tmp;
  public static int cnt = 0; // 배열 A에 K번째 저장되는 수
  public static int result = -1; // 저장 횟수가 K보다 작으면 -1

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());

    A = new int[N];
    tmp = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    mergeSort(A, 0,   N-1);

    bw.write(result + "\n");

    br.close();
    bw.flush();
    bw.close();
  }

  // A[p..r]을 오름차순 정렬한다.
  public static void mergeSort(int[] A, int p, int r) {
    if (cnt > K)
      return;

    if (p < r) {
      int q = (p + r) / 2; // q는 p, r의 중간 지점
      mergeSort(A, p, q); // 전반부 정렬
      mergeSort(A, q+1, r); // 후반부 정렬
      merge(A, p, q, r); // 병합
    }
  }

  // A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
  // A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
  public static void merge(int[] A, int p, int q, int r) {
    int i = p;
    int j = q + 1;
    int t = 0;

    while (i <= q && j <= r) {
      if (A[i] <= A[j]) {
        tmp[t++] = A[i++];
      } else {
        tmp[t++] = A[j++];
      }
    }

    // 왼쪽 배열 부분이 남은 경우
    while (i <= q) {
      tmp[t++] = A[i++];
    }

    // 오른쪽 배열 부분이 남은 경우
    while (j <= r) {
      tmp[t++] = A[j++];
    }

    i = p;
    t = 0;

    // 결과를 A[p..r]에 저장
    while (i <= r) {
      cnt++;

      if (cnt == K) {
        result = tmp[t];
        break;
      }

      A[i++] = tmp[t++];
    }
  }
}


/* 
// merge sort sudo code
merge_sort(A[p..r]) { # A[p..r]을 오름차순 정렬한다.
  if (p < r) then {
    q <- ⌊(p + r) / 2⌋;       # q는 p, r의 중간 지점
    merge_sort(A, p, q);      # 전반부 정렬
    merge_sort(A, q + 1, r);  # 후반부 정렬
    merge(A, p, q, r);        # 병합
  }
}

# A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
# A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
merge(A[], p, q, r) {
  i <- p; j <- q + 1; t <- 1;
  while (i ≤ q and j ≤ r) {
    if (A[i] ≤ A[j])
    then tmp[t++] <- A[i++]; # tmp[t] <- A[i]; t++; i++;
        else tmp[t++] <- A[j++]; # tmp[t] <- A[j]; t++; j++;
  }
  while (i ≤ q)  # 왼쪽 배열 부분이 남은 경우
  tmp[t++] <- A[i++];
  while (j ≤ r)  # 오른쪽 배열 부분이 남은 경우
  tmp[t++] <- A[j++];
  i <- p; t <- 1;
  while (i ≤ r)  # 결과를 A[p..r]에 저장
  A[i++] <- tmp[t++];
}
*/
