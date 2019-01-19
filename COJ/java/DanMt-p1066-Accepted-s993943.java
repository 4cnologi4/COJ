import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class PoligonosRegulares1066 {

    static final double PI = 3.141592653589793;

    public static void main(String[] args) {

        DecimalFormat f = new DecimalFormat("###.0000");
        Scanner sc = new Scanner(System.in);
        
        int caso = sc.nextInt();

        for (int i = 0; i < caso; i++) {
             
            double R = sc.nextDouble();
            int n = sc.nextInt();
            
            System.out.println(f.format(perimetroInscrito(R, n)) + " " + 
                    f.format(perimetroCircunscrito(R,n)));
        
        }

    }

    public static double perimetroInscrito(double R, int n) {

        return 2 * n * R * Math.sin(PI / n);

    }

    public static double perimetroCircunscrito(double R, int n) {

        return 2 * n * R * Math.tan(PI / n);

    }

}