import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class DiagonalesDeConteo2146 {


   public static void main(String[] args) {
   
       Scanner sc = new Scanner(System.in);
       long d = sc.nextLong(); long v = sc.nextLong();
       
       if ( (v*(v-3)/2) == d){
           System.out.println("yes");
       }
       else {
           System.out.println("no");
       }
   
   }
    
}