import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class LastDigitAB1388 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {

            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            System.out.println(last(a, b));

        }
    }

    public static BigInteger last(BigInteger a, BigInteger b) {

        return a.modPow(b, new BigInteger("10"));
    }

}