import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jager
 */
public class Modulo1300 {

    public static void main(String[] args) {

        Set se = new HashSet();
        Scanner sc = new Scanner(System.in);
        int cmod = 0;
        for (int i = 0; i < 10; i++) {
            int N = sc.nextInt();
            se.add(N%42);

           
        }
        System.out.println(se.size());
    }

}