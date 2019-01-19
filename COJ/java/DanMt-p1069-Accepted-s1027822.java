import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Tren3040 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int t, e, f, c, to, s;
         
    t = sc.nextInt();
    
        for (int i = 0; i < t; i++) {
            
            e = sc.nextInt();
            f = sc.nextInt();
            c = sc.nextInt();
            
            to = e +f;
            s = 0;
            
            if(c == 1){
                System.out.println("0");
            }else{
                while(to >= c){
                    to = to - c +1;
                    s++;
                }
                System.out.println(s);
            }
            
        }
    
    }
    
}