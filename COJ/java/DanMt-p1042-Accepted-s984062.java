import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class BukaII2863 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("###.0");

        int T, aux;
        double h, d, acum = 0.0, Crompe;

        T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            h = sc.nextDouble();
            d = sc.nextDouble();

            Crompe = ((h * h) - d * d) / (2 * h);
            System.out.println(form.format(Crompe));
            acum += Crompe;

        }
        System.out.println(form.format(acum/T));

    }

}