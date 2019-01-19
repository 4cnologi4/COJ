import java.util.Scanner;
public class Coj2734 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int C=0;
    while (sc.hasNext()){
    String OP=sc.next();
    int N=sc.nextInt();
    switch (OP){
        case "suma":
            C+=N;
            break;
        case "resta":
            C-=N;
            break;
    }
    }
        System.out.println("resultado: "+C);
    }
}