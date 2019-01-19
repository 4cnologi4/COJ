import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Tren3040 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }

    }

}