import java.util.Scanner;

public class CocoString2732 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        int ncase = sc.nextInt();
        for (int i = 0; i < ncase; i++) {
            cadena = sc.next();
            System.out.println(morfosis(cadena));
     }

     }

    public static String morfosis(String cadena) {
        String cadena2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isLowerCase(cadena.charAt(i)) ){
                cadena2+=String.valueOf(cadena.charAt(i)).toUpperCase();
            }else{
            cadena2+=String.valueOf(cadena.charAt(i)).toLowerCase();
            }
            
                }
        return cadena2;
    }
   } 