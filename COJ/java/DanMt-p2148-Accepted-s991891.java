import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class FormulaCuadratica2148 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double Q;
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            Q = Math.sqrt((b*b)-4*a*c);
            
            if(Q > 0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            
        }

    }

}
