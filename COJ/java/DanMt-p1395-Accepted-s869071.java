import java.util.Scanner;

public class BigNumero1395 {

    static double vec[] = new double[10000001];
    static Scanner sc = new Scanner(System.in);

    static void metodo() {
        vec[1] = 1;

        for (int i = 2; i < vec.length; i++) {
            vec[i] = vec[i - 1] + Math.log10(i);
        }

    }

    public static void main(String[] args) {
        metodo();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            Respuesta(num);

        }
    }

    private static void Respuesta(int num) {
        System.out.println((int) vec[num]);
    }

}