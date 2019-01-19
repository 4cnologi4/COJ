import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Bijele1180 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arg[] = new int[6];
        arg[0] = 1;
        arg[1] = 1;
        arg[2] = 2;
        arg[3] = 2;
        arg[4] = 2;
        arg[5] = 8;

        int total = 0, t1, t2, t3, t4, t5, t6;
        int T = sc.nextInt();

        while (total < T) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();

            t1 = arg[0] - a;
            t2 = arg[1] - b;
            t3 = arg[2] - c;
            t4 = arg[3] - d;
            t5 = arg[4] - e;
            t6 = arg[5] - f;

            System.out.println(t1 + " " + t2 + " " + t3 + " " + t4 + " " + t5 + " " + t6);

            total++;

        }

    }

}