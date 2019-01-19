import java.util.Scanner;
public class Sumatoria{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int Sumatoria,n;
n= sc.nextInt();
if (n>0){
Sumatoria =n*(n+1)/2;
}
else{
Sumatoria=((((n*n)+((-1)*n))/2)-1)*(-1);
}
System.out.println(Sumatoria);
}
}