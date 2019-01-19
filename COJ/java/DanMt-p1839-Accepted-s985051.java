import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class TareaDivertida1839 {

    public static void main(String[] args) {

        int guardia, temp = 0, Caso;
        Scanner sc = new Scanner(System.in);

        Caso = sc.nextInt();
        for (int i = 0; i < Caso; i++) {
            guardia = sc.nextInt();
            temp = guardia;
            for (int g = 0; g < 3; g++) {

                temp += 3; // temp + 3
                temp *= 2; // temp * 2

            }
            System.out.println(temp);
        }
    }

}