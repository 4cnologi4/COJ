import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class RentAirplane1005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double cuad = 0;

        cuadratica(a, b, c,cuad);

    }

    protected static void cuadratica(double a, double b, double c,double cuad) {
        cuad = (b * b) - (4 * a * c);
        if (cuad >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}