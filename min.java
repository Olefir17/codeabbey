/**
 * Created by Admin on 01.05.2016.
 */
public class min {
    static int min = 0;
         public static void main(String[] args) {

        getMin(265671,0 -6621521);
        getMin(8568865, 8909308);
        getMin(-6947671, 7074909);
                 }

    public static int getMin(int a,int b){
        if (a > b) {
             min = b;
        } else {
             min = a;
        }
        System.out.print(min + " ");
        return  min;
    }
}
