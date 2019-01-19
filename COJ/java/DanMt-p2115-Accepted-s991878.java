import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class HotDogs2115 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat  f = new DecimalFormat("##0.00");
    
    double H,P,Pro;
    
    while(sc.hasNext()){
    H = sc.nextDouble(); P = sc.nextDouble();
    
    Pro = H/P;
    
        System.out.println(f.format(Pro));
    }
    
    }
    
}