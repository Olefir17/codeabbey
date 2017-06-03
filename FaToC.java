/**
 * Created by Анастасия on 15.10.2016.
 */

public class FaToC {
    public static void main(String[] args) {
        int n = 31;


        int[] ar= {514,117,412,340,559,267,453,461,89,368,114,120,405,423,161,458,99,112,323,334,187,326,573,274,513,596,560,432,526,248,497};

        //int[] ar = {495,353,168,-39,22};
        for (int i = 0; i < ar.length; i++) {

            ar[i]= (int)Math.round ((ar[i]-32)/1.8);

            System.out.print(ar[i]+" ");

        }


    }

}
