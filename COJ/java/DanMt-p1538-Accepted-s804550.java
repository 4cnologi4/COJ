import java.util.Scanner;
import java.io.PrintWriter;
import java.text.DecimalFormat;
public class FinancialManagementII {

    public static void main(String[] args) {
        Scanner KOKORO = new Scanner(System.in);
        DecimalFormat Form = new DecimalFormat("###,###,###.00");
        PrintWriter pw = new PrintWriter(System.out);
        double N, PRO, ACU = 0;
        int T,i;
                    T = KOKORO.nextInt();
                    for (i=1;i <=T; i++) {
                    ACU=0;
            for (int j = 0; j < 12; j++) {
                   N = KOKORO.nextDouble();
                   ACU = ACU + N;
                  
                   }
        PRO=ACU/12;
            pw.println(i+(" ") + ("$") + Form.format(PRO));
            }
                    pw.close();
      }
}