import java.util.Scanner;
import java.text.DecimalFormat;
public class Va2650 {

    public static void main(String[] args) {
        Scanner vea = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float X, Y, B;
        X = vea.nextFloat();
        Y = vea.nextFloat();
        B = 1 - (Y / X);
        System.out.println(formato.format(B));
    }
}