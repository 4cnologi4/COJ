import java.util.Scanner;
public class Vacaloca{
    public static void main(String[] args) {
      Scanner vea = new Scanner(System.in);
      String va = vea.next();
      String via = vea.next();
        System.out.println(multiplicacion(va,via));
    }
    public static int multiplicacion(String va,String via){
        int No,veeeaaa,con=0,c=0;
        for(int x=0;x<va.length();x++)
        {
            No = Integer.parseInt(String.valueOf(va.charAt(x)));
            c+=No;
        }
        for(int y=0;y<via.length();y++)
        {
            veeeaaa = Integer.parseInt(String.valueOf(via.charAt(y)));
            con+=veeeaaa;
        }
        return c*con;
       }
   }