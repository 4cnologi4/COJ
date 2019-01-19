import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Coj2698 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String Cadena = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int SUM = 0;    
        String cadena2 = sc.next();
        
        for (int i = 0; i < cadena2.length(); i++) {
               for (int j = 0; j < Cadena.length(); j++) {
                if (cadena2.charAt(i)==Cadena.charAt(j)){
                    SUM+=(j+1); 
                    break;
                }
            }
        }
        System.out.println(SUM);  
    }
    
}