import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Coprimos1050 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (coprimos(i, n)) {
                c++;
            }

        }
        System.out.println(c);

    }

    public static boolean coprimos(int i, int n) {

        if (i % n == 1) {
            return true;
        }
        if (i % n == 0) {
            return false;
        }
        return coprimos(n, i % n);
    }

}
