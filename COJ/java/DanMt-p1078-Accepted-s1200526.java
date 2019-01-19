import java.util.Scanner;

public class Candies1078 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
       long T = sc.nextLong();
        for (long i = 0; i < T; i++) { //numero de casos
            
           long N = sc.nextLong();
           long suma = 0; 
           for (long j = 0; j < N; j++) {  //numero de niños
               long C = sc.nextLong();  //leer caramelos 
                
                suma = suma + C; 
            }
            
            if (suma % N == 0) { 
            System.out.println("YES");
        } else {
            System.out.println("NO");
            }
        
        } 
        
    }

}