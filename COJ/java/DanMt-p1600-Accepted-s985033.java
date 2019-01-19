import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class BigPowers1600 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger num1;
        BigInteger num2;

        for (;;) {
            num1 = sc.nextBigInteger();
            num2 = sc.nextBigInteger();

            if (num1.equals(BigInteger.ZERO) && num2.equals(BigInteger.ZERO)) {
                break;
            }
            num1 = num1.modPow(num2, BigInteger.TEN);
            System.out.println(num1);

        }

    }

}