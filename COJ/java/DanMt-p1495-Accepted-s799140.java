import java.util.Scanner;
import java.util.Arrays;
public class Maximizarvea{
public static void main(String [] args){

Scanner vea=new Scanner(System.in);
int va[]; int swat;
swat = vea.nextInt();
va=new int[swat];
for (int zee=0;zee<swat;zee++)
va[zee]=vea.nextInt();
Arrays.sort(va);
for (int zee=0;zee<swat;zee++)
System.out.println(va[zee]);
}
}