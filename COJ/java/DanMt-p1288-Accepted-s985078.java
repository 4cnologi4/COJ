import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Div61288 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BigInteger big;
        BigInteger dos = new BigInteger("2");
        BigInteger tres = new BigInteger("3");
        
        int Caso = sc.nextInt();
        for (int i = 0; i < Caso; i++) {
            
            big = sc.nextBigInteger();

//            if (big.mod(dos).equals(BigInteger.ZERO)) {
//                System.out.println("YES");
//            }
            if (big.mod(dos).equals(BigInteger.ZERO) && big.mod(tres).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
        
    }
    
}