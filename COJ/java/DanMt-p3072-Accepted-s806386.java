import java.util.Scanner;
public class Sandia3072 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        if (N==2){
            System.out.println("NO");
        }else if (N!=2){
            if (N%2==0){
                System.out.println("YES");
                   }        
            else{ 
                System.out.println("NO");
              }
          }
     }
}