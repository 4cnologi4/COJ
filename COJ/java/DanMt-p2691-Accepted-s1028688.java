import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Promedio2785 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[], b[], suma = 0, sumb = 0, n, m;

        n = sc.nextShort();
        m = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextShort();
            suma += a[i];
        }

        b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            sumb += b[i];
        }
        if (suma > sumb) {
            System.out.println("first win");
        } else if (suma < sumb) {
            System.out.println("second win");
        } else {
            System.out.println("tie");
        }

    }

}