import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class SuperSuma2904 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger big = new BigInteger("0");
        BigInteger big2 = new BigInteger("0");

        int N;
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {

            big2 = sc.nextBigInteger();
            big = big.add(big2);

        }
        System.out.println(big);
    }

}
