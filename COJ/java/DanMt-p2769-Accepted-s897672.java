import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class DiaDelING2769 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println( ((N+i)-N) + ": I am participating in the Engineer's day.");
        }
        
    }
    
}