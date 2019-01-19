import java.util.Scanner;
public class ProbabilidadRedondeo {
    public static void main(String[] args) {
    Scanner lol=new Scanner(System.in);
    double N; int T,aux=0;
    N=lol.nextDouble(); T=lol.nextInt();
    if (T==1) aux=10;
    if (T==2) aux=100;
    if (T==3) aux=1000;
    if (T==4) aux=10000;
    if (T==5) aux=100000;
    if (T==6) aux=1000000;
   
     System.out.println(Math.rint(N*aux)/aux);
    }
}