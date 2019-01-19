import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class ConcursoBelleza2145 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();

        int arg[][] = new int[in][10];

        for (int i = 0; i < in; i++) {
            for (int j = 0; j < 10; j++) {
                arg[i][j] = sc.nextInt();
            }
            Arrays.sort(arg[i]);
        }
        int suma = 0;
        for (int i = 0; i < in; i++) {
            suma = 0;
            for (int j = 1; j < 9; j++) {
                suma += arg[i][j];
            }

            System.out.print((i + 1) + " "); System.out.println(suma);
        }
    }

}