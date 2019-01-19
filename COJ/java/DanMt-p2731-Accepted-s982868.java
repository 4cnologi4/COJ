import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class COcoBitsyElpozo2731 {
    
    public static void main(String[] args) {
        
        int Ncaso;
        double L, Tam;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("###.00");
        
        Ncaso = sc.nextInt();
        for (int i = 0; i < Ncaso; i++) {
            L = sc.nextDouble();
            Tam = (L * L) - Math.PI * (Math.pow(L / 2, 2));
            System.out.println(form.format(Tam));
            
        }
        
    }
    
}