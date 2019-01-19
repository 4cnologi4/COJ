import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class FueraDeLugar1630 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int atak = sc.nextInt();
            int def = sc.nextInt();
            
            if(atak == 0 && def == 0)break;
            
            int atac[] = new int[atak];
            int de[] = new int[def];

            for (int i = 0; i < atak; i++) {
                atac[i] = sc.nextInt();
            }

            for (int j = 0; j < def; j++) {
                de[j] = sc.nextInt();
            }

            Arrays.sort(atac);
            Arrays.sort(de);

            if (atac[0] < de[1]) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }

}
