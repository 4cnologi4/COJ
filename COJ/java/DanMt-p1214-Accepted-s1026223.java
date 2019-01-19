import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class LadoRombo1214 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##0.00");

        int caso = sc.nextInt();
        for (int i = 0; i < caso; i++) {
            double a = sc.nextDouble();
            double s = sc.nextDouble();
            System.out.println(f.format(lado(a,s)));
        }

    }

    public static double lado(double a, double s) {
        
        return Math.sqrt(s*s - 4*a)/2;
    }

}
