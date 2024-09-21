import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int numerator1 = Integer.parseInt(st.nextToken());
    int denominator1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int numerator2 = Integer.parseInt(st.nextToken());
    int denominator2 = Integer.parseInt(st.nextToken());

    int commonDenominator = denominator1 * denominator2;
    int calculationNumerator = numerator1 * denominator2 + numerator2 * denominator1;

    int gcd = getGCD(commonDenominator, calculationNumerator);

    int resultNumerator = calculationNumerator / gcd;
    int resultDenominator = commonDenominator / gcd;

    bw.write(resultNumerator + " " + resultDenominator + "\n");

    br.close();

    bw.flush();
    bw.close();
  }

  public static int getGCD(int commonDenominator, int calculationNumerator) {
    if (commonDenominator % calculationNumerator == 0) {
      return calculationNumerator;
    }
    return getGCD(calculationNumerator, commonDenominator % calculationNumerator);
  }
}