import java.io.*;
import java.math.BigInteger;

/**
 *
 * @author Jager
 */
public class ExpModulo2422 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lee;
        String[] arg;
        BigInteger exp;
        String s = "1000000000";
        BigInteger res;
        BigInteger ult = new BigInteger(s);

        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            
            lee = br.readLine();
            arg = lee.split(" ");
            s = arg[0];
            res = new BigInteger(s);
            s = arg[1];
            exp = new BigInteger(s);
            res = res.modPow(exp, ult);
            System.out.println(res);
            
        }
        
    }

}