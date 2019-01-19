import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class OrdenAscendente2784 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter p = new PrintWriter(System.out);
        
        
        int[] arg;
        int T = sc.nextInt();

        arg = new int[T];
        for (int i = 0; i < T; i++) {
            arg[i] = sc.nextInt();
        }

        Arrays.sort(arg);
        if (T == 1) {
            p.println(arg[0]);
            p.close();
            return;
        }
        p.print(arg[T - 1] + " ");
        for (int k = 0; k < T - 2; k++) {
            p.print(arg[k] + " ");
        }
        p.println(arg[T - 2]);
        p.close();
    }
}