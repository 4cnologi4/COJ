import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Euler3258 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            n = sc.nextInt();
            System.out.println(euler(n));
        }

    }

    public static int euler(int n) {

        return (int) (Math.log(n) / Math.log(2.7182818284590452354) + 1);
    }

}