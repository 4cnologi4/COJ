import java.util.Scanner;

public class OtraClasificacion2979 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] x = new int[100];
        int T, N, C;
        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            C = 0;
            N = sc.nextInt();

            for (int j = 1; j <= N; j++) {
                x[j] = sc.nextInt();
                if (x[j] != j) {
                    C++;
                }
            }
            System.out.println(C);
        }
    }
}