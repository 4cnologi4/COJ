import java.text.DecimalFormat;
import java.util.Scanner;

public class EscribeNumeros3614 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("###.#");
        float m, d, t;

        int cas = sc.nextInt();
        for (int i = 0; i < cas; i++) {
            m = sc.nextFloat();
            d = sc.nextFloat();
            t = (-(d * (1 / m)) + d);
            System.out.println(f.format(t));
        }

    }
}