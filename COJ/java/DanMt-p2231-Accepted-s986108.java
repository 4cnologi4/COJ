import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Desafio2231 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T, CA = 0, CB = 0;
        String A, B;

        T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            A = sc.next();
            B = sc.next();

            if ("rock".equals(A) && "scissors".equals(B)) {
                CA++;
            } else if ("scissors".equals(A) && "rock".equals(B)) {
                CB++;
            } else if ("paper".equals(A) && "rock".equals(B)) {
                CA++;
            } else if ("rock".equals(A) && "paper".equals(B)) {
                CB++;
            } else if ("scissors".equals(A) && "paper".equals(B)) {
                CA++;
            } else if ("paper".equals(A) && "scissors".equals(B)) {
                CB++;
            }

        }
        
        if(CA>CB){
            System.out.println("A win");
        }else if(CB>CA){
            System.out.println("B win");
        }else if(CA==CB){
            System.out.println("tied");
        }

    }

}