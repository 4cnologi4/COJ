import java.util.Scanner;
public class Pisa {
    public static void main(String[] args) {
    Scanner gato=new Scanner (System.in);
    int CAT[]=new int[8];
        for (int i = 0; i < 8; i++) {
            CAT[i]=gato.nextInt();
        }
        System.out.println(Com(CAT));
    }     
    public static int Com(int CAT[]){
    int max=0;
    int Mario[] = new int[8];
    Mario[0]=CAT[0]+CAT[1]+CAT[2]+CAT[3];
    Mario[1]=CAT[1]+CAT[2]+CAT[3]+CAT[4];
    Mario[2]=CAT[2]+CAT[3]+CAT[4]+CAT[5];
    Mario[3]=CAT[3]+CAT[4]+CAT[5]+CAT[6];
    Mario[4]=CAT[4]+CAT[5]+CAT[6]+CAT[7];
    Mario[5]=CAT[5]+CAT[6]+CAT[7]+CAT[0];
    Mario[6]=CAT[6]+CAT[7]+CAT[0]+CAT[1];
    Mario[7]=CAT[7]+CAT[0]+CAT[1]+CAT[2];
    
        for (int i = 0; i < 8; i++) {
        if (Mario[i]>max)
            max=Mario[i];
        }
        return max;
    }
}
