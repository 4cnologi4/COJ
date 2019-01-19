import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class UnSimpleCalculo1070 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cua = 0, rec = 0;

        while (sc.hasNext()) {
            int N = sc.nextInt();
            cua = (N * (N + 1) * (2 * N + 1)) / 6;
            rec = (N * N * (N + 1) * (N + 1)) / 4;
            System.out.println(cua + " " + rec);
        }
    }

}