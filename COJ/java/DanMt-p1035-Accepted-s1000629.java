import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class RaizModuloSeno1035 {

    static final int mod = 1000000;
    static final int arg[] = new int[1000005];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num != -1) {

            System.out.println(Formula(num));

            num = sc.nextInt();
        }

    }

    public static int Formula(int n) {
        if (n == 0) {
            return 1;
        } else if (arg[n] != 0) {
        return arg[n];
        } 
        else {
            return arg[n] = (Formula((int) (n - Math.sqrt(n))) + Formula((int) Math.log(n))
                    + Formula((int) ((int) n * Math.pow(Math.sin(n), 2)))) % mod;
        }
    }

}