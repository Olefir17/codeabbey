import java.util.Scanner;


public class Riunding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] ar = new double[2];
        int[] ar2 = new int[n];
       // int[] ar3 = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <2 ; j++) {
                ar[j]=sc.nextDouble();
            }


            ar2[i]= (int) Math.round(ar[0]/ar[1]);
            System.out.print(ar2[i]+ " ");

        }



    }

}