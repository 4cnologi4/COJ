import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Divisible4951297 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger big = new BigInteger("495");

        int C = sc.nextInt();
        BigInteger N, Res;
        for (int i = 0; i < C; i++) {

            N = sc.nextBigInteger();
            Res = N.mod(big);

            if (Res.equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}