import java.text.DecimalFormat;
import java.util.Scanner;

public class ABCOMPLEJO1805 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("#.#");

        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = ((a + b) + (a - b) + (b + a) + (b - a));
        System.out.println(form.format(c));
    }

}