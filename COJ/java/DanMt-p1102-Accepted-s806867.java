import java.util.Scanner;
import java.math.BigInteger;
public class MULTIPLODE111102 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    BigInteger choy=new BigInteger("11");
    BigInteger cero =new BigInteger("0");
    BigInteger N;
    do{
     N=sc.nextBigInteger();
    if (N.compareTo(cero)==1){
    BigInteger mod =N.mod(choy);
        if (mod.equals(cero)){
        System.out.println(N + " is a multiple of 11.");
    }    
    else {
        System.out.println(N + " is not a multiple of 11.");
    }
    }
    }while (N.compareTo(BigInteger.ZERO)!=0);
    }
}