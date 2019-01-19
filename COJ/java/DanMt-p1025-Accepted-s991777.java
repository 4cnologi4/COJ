import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class DemocracyinDanger1025 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();
        int mitad = (Num + 1) / 2;
        int[] arg = new int[Num];
        for (int i = 0; i < Num; i++) {
            arg[i] = sc.nextInt();
        }
        Arrays.sort(arg);
        int suma = 0;
        for (int i = 0; i < mitad; i++) {
            suma += (arg[i] + 2) / 2;
        }
        System.out.println(suma);
    }

}