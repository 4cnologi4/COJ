import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Octogono2853 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("##0.000");

        double L;

        L = sc.nextDouble();
        while (L != 0) {
               
            double apo = sqrt(2 * ((L / 2) * (L / 2)));
            double lado = 2 * apo - L;
            double per = 8 * lado;
            double ar = (per * (L / 2)) / 2;
            
            System.out.println(form.format(ar));
            
            L = sc.nextInt();
        }
    }

}