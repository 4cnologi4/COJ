import java.util.Scanner;

/**
 *
 * @author Jager
 */
public class Basseball1457 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); //numero de equipos
        long K = sc.nextLong(); //numero de juegos
        System.out.println(TotalJuegos(N, K));

    }

    public static Long TotalJuegos(long N, long K) {
        long total = 0;
        if (N % 2 == 0) {
            total = ((N / 2) * K) * (N - 1);
        } else {
            total = ((N / 2) * K) + K * (N - 1);
        }
        return total;
    }
}
