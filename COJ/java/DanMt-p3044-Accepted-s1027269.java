import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class SumaBinaria2380 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int [4],
                b[] = new int [4],
                    gunnar = 0, emma = 0;

        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
            gunnar += a[i];
        }
        for (int i = 0; i < 4; i++) {
            b[i] = sc.nextInt();
            emma += b[i];
        }
        
        if(emma>gunnar){
            System.out.println("Emma");
        }else if(emma<gunnar){
            System.out.println("Gunnar");
        }else{
            System.out.println("Tie");
        }
        
    }
}