import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Egipto1441 {

    static int a, b, c;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        while (a != 0 && b != 0 && c != 0) {

            if ((a * a) + (b * b) == c * c) {
                System.out.println("right");
            } else if ((b * b) + (c * c) == (a * a)) {
                System.out.println("right");
            } else if ((a * a) + (c * c) == (b * b)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

        }
    }
}