import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class OG1933 {

    static int l, r;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int adicion = 0;

        l = sc.nextInt();
        r = sc.nextInt();

        while (l != 0 && r != 0) {
            
            adicion = l + r;
            System.out.println(adicion);
            l = sc.nextInt();
            r = sc.nextInt();
        }
    
    }

}