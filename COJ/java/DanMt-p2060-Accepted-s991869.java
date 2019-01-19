import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Debate2060 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entra, temp;

        while (sc.hasNext()) {
            entra = sc.nextInt();
            if (entra == -1) break;
            
            int sum = 0;
            int tot = 0;
            
            for (int i = 0; i < entra; i++) {

                temp = sc.nextInt();
                sum += temp;
                if (sum % 100 == 0) tot++;
                
            }
            System.out.println(tot);
        }

    }

}