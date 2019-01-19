import java.util.Scanner;
import java.text.DecimalFormat;
public class TAREAGEOMETRIA1493{
public static void main(String [] args){

Scanner gato=new Scanner(System.in);
DecimalFormat CAT=new DecimalFormat("0.00");
String shape;
shape=gato.next();

switch (shape){
case "circle": double R;
R=gato.nextDouble();
System.out.print(CAT.format((R*R)*3.14));
break;

case "triangle":double base,altu;
base=gato.nextDouble(); altu=gato.nextDouble();
System.out.print(CAT.format((base*altu)/2));
break;
    
case "rhombus":double D,d;
    D=gato.nextDouble(); d=gato.nextDouble();
    System.out.print(CAT.format((D*d)/2));
    break;
}
}
}