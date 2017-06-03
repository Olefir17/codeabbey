import java.util.Scanner;

/**
 * Created by Анастасия on 17.10.2016.
 */
public class DiceRolling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] f = new float[n];
        int[] r = new int[n] ;
        int[] z = new int[n] ;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <1 ; j++) {
                f[j] = sc.nextFloat();
            }
             r[i] = (int) Math.floor(6*f[0]);
            z[i]=r[i]+1;
            System.out.print(z[i]+" ");

        }


    }
}
