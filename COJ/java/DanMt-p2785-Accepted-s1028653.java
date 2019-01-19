import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Promedio2785 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int t;
        double n, sum = 0, pro;

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextDouble();
            sum += n;
        }

        pro = sum / t;
        System.out.println(df.format(pro));

    }

}