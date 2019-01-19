import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class ProblemasVarios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, x, y;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (x == y) {
                if (x % 2 == 0) {
                    System.out.println(2 * x);
                } else {
                    System.out.println(2 * x - 1);
                }
            } else if (x - 2 == y) {
                if (x % 2 == 0) {
                    System.out.println(x + y);
                } else {
                    System.out.println(x + y - 1);
                }
            } else {
                System.out.println("No Number");
            }
        }

    }

}