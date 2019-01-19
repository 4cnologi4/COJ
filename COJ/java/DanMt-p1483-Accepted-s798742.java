import java.util.Scanner;
public class lolmariolol{
public static void main(String [] args){

Scanner gato=new Scanner(System.in);
String shape;
shape=gato.next();

switch (shape){
case "square": int n;
n=gato.nextInt();
System.out.println(n*n);
break;

case "rectangle":int base,altu;
base=gato.nextInt(); altu=gato.nextInt();
System.out.println(base*altu);
break;
}

}
}