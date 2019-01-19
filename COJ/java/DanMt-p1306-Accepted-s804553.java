import java.util.Scanner;
import java.math.BigInteger;
import java.io.PrintWriter;
public class Div4II {
    public static void main(String[] args) {
    Scanner in      = new Scanner(System.in);
    BigInteger cuatro = new    BigInteger("4");
    BigInteger cero   = new    BigInteger("0");
    PrintWriter pr = new PrintWriter(System.out);
    int t = in.nextInt();
    for(int x=1;x<=t;x++)
    {
        BigInteger obj = in.nextBigInteger();
    BigInteger mod = obj.mod(cuatro);
        if(mod.equals(cero)){
            pr.println("YES");
        }
        else{
            pr.println("NO");
        }
    }
    pr.close();
            
    }
}