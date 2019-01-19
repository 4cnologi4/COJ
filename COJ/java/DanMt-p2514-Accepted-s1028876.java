import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class ProblemasVarios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        String s, l;
        int n, ra, k;
        double w, w2, m = 0, p;
        s = sc.next();
        n = sc.nextInt();
        System.out.println("Tournament: " + s);
        System.out.println("Number of players: " + n);
        System.out.println("New ratings:");
        for (int i = 0; i < n; i++) {
            l = sc.next();
            ra = sc.nextInt();
            w = sc.nextDouble();
            w2 = sc.nextDouble();
            k = sc.nextInt();

            p = ra + k * (w - w2);
            m += ra + 0.0;
            System.out.print(l + " ");
            System.out.println(df.format(p));
        }
        m /= n;
        System.out.println("Media Elo: " + df.format(m));
    }
}