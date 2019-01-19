import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class MultiplicacionMatricial2690 {

    static int F, C, F1, C1, i, j,k,l;
    static int arg[][] = new int[110][110];
    static int arg2[][] = new int[110][110];
    static int arg3[][] = new int[110][110];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        F = sc.nextInt();
        C = sc.nextInt();
        for (i = 0; i < F; i++) {
            for (j = 0; j < C; j++) {
                arg[i][j] = sc.nextInt();
            }
        }

        F1 = sc.nextInt();
        C1 = sc.nextInt();
        for (k = 0; k < F1; k++) {
            for (l = 0; l < C1; l++) {
                arg2[k][l] = sc.nextInt();
            }
        }
        
        if(C != F1){
            System.out.println("The matrices can not be multiplied");
        }else{
            for (int m = 0; m < F; m++) {
                for (int n = 0; n < C1; n++) {
                    for (int o = 0; o < F1; o++) {
                        arg3[m][n] += arg[m][o] * arg2[o][n];
                    }
                    System.out.print(arg3[m][n] + " ");
                }
                System.out.print("\n");
            }
        }

    }

}