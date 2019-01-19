import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Autobus3013 {

    public static void main(String[] args) {

        int[] x = new int[30];
        x[0] = 1;
        x[1] = 3;
        x[2] = 7;
        x[3] = 15;
        x[4] = 31;
        x[5] = 63;
        x[6] = 127;
        x[7] = 255;
        x[8] = 511;
        x[9] = 1023;
        x[10] = 2047;
        x[11] = 4095;
        x[12] = 8191;
        x[13] = 16383;
        x[14] = 32767;
        x[15] = 65535;
        x[16] = 131071;
        x[17] = 262143;
        x[18] = 524287;
        x[19] = 1048575;
        x[20] = 2097151;
        x[21] = 4194303;
        x[22] = 8388607;
        x[23] = 16777215;
        x[24] = 33554431;
        x[25] = 67108863;
        x[26] = 134217727;
        x[27] = 268435455;
        x[28] = 536870911;
        x[29] = 1073741823;

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int K = sc.nextInt();
            System.out.println(x[K - 1]);

        }

    }

}