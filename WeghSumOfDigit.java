import java.util.Scanner;

/**
 * Created by Анастасия on 17.10.2016.
 */
public class WeghSumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                a[j]=sc.nextInt();
            }
            c[i]=i;
            while (a[i]!=0){
                b[i]+=a[i]%10;
                a[i]=a[i]/10;
            }

            d[i]=c[i]*b[i];
            System.out.println(d[i]);

        }




    }
}
