import java.util.Scanner;

public class AAAAh2620 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cad = "a";

        int radio = sc.nextInt();
        int rad = radio * 4;

        System.out.print("A");
        for (int i = 0; i < rad; i++) {
            System.out.print(cad);
        }
        System.out.print("h");
    }

}