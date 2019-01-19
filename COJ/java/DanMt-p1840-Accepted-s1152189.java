import java.util.Scanner;

public class Broken1814 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[7];
        boolean esta;
        int c = sc.nextInt();
        for (int i = 1; i <= c; i++) {
            String s = sc.next();
            for (int j = 0; j < 6; j++) {
                a[j] = 0;
            }
            for (int j = 0; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'B':
                        a[0]++;
                        break;
                    case 'R':
                        a[1]++;
                        break;
                    case 'O':
                        a[2]++;
                        break;
                    case 'K':
                        a[3]++;
                        break;
                    case 'E':
                        a[4]++;
                        break;
                    case 'N':
                        a[5]++;
                        break;
                }
            }
            esta = ((a[0] == a[1]) && (a[0] == a[2])
                && (a[0] == a[3]) && (a[0] == a[4]) && (a[0] == a[5]));
            if (!esta) {
                System.out.println("Secure");
            }else{
                System.out.println("No Secure");
            }
        }
    }
}