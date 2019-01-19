import java.util.Scanner;

/**
 * 
 *
 * @author Jager
 */
public class Herman1301 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x, y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        while (true) {
            if (x == 0 && y == 0) {
                System.out.println("AXIS");
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            }
            
            if(x == 0 || y == 0){
                System.out.println("AXIS");
            }

            x = sc.nextDouble();
            y = sc.nextDouble();
        }

    }
}