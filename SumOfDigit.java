import java.util.ArrayList;
import java.util.Scanner;
    public class SumOfDigit {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[3];
            int[] r = new int[n];
            int[] v = new int[n];
            for (int i=0; i<n; i++)
            {
                for (int j=0; j<3; j++)
                {
                   a[j]=sc.nextInt();
                }

                r[i]=a[0]*a[1]+a[2];
            }


            for (int o=0; o<n; o++)
            {
                while(r[o]!=0)
                {
                    v[o]+=r[o]%10;
                    r[o]=r[o]/10;
                }

                System.out.print(v[o]+" ");
            }

        }}

