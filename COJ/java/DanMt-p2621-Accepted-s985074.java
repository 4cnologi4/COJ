import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class NumAdivinado2621 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = 0;

        
        while (n > 0) {
            n = n/2;
            temp++;
        }

        System.out.println(temp);

    }

}