import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class ProblemasVarios {

    protected static double PI = 3.141592653589793;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        while (sc.hasNext()) {
            double r = sc.nextDouble();
            System.out.println(df.format((r * r) - (r * r / 3) - (PI * (r * r / 9))));
        }
    }
}