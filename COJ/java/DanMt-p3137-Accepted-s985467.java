import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class ValidaABC3137 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

                           
                if (a+b==c || a-b==c || a*b == c || (b>0 && a/b==c) || (b > 0 && a%b==c)) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                } 
                
            }
        }
    }