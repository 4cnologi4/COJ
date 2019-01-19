import java.text.DecimalFormat;

/**
 *
 * @author Jager
 */
public class UCalculaE1157 {

    public static void main(String[] args) {
        int fac = 2, i;
        double N = 2.5, a = 1;
        DecimalFormat form = new DecimalFormat("#.000000000");
        System.out.println("n e");
        System.out.println("- -----------");
        System.out.println("0 1");
        System.out.println("1 2");
        System.out.println("2 2.5");

        for (i = 3; i <= 9; i++) {

            N = N + a / (fac * i);
            fac = fac * i;
            System.out.println(i + " " + form.format(N));
        }

    }

}