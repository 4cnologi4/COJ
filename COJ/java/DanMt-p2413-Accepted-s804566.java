import java.util.Scanner;
public class Ziguala {
    public static void main(String[] args) {
    Scanner rico=new Scanner(System.in);
    int T;
    T=rico.nextInt();
    for (int i = 1; i <= T; i++) {
    String div5=rico.next();
    int num=Integer.parseInt(String.valueOf(div5.charAt(div5.length()-1)));
    if (num==0||num==5)
        System.out.println("YES");
    else 
        System.out.println("NO");
        }
    }
}