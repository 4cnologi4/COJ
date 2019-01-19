import java.util.Scanner;
import java.math.BigInteger;

public class Hareunagenkidama{
public static void main (String [] args){

Scanner sc=new Scanner(System.in);
BigInteger osonegro=new BigInteger("2");
int tonayan;
tonayan=sc.nextInt();
osonegro = osonegro.pow(tonayan);

System.out.println(osonegro);
}
}