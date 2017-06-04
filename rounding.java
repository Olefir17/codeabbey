import java.math.BigDecimal;

/**
 * Created by Admin on 01.05.2016.
 */
public class rounding {
    public static int num;
    public static void getRound(double a, double b){
        double result= (a / b);
        double round = a % b;
        double x = result++;
        if (result > 0 && (result+ 0.5)>x){
            num = (int)Math.ceil(a / b);
        }
        else if(result > 0 && (result+ 0.5)<=x ) {

            num = (int)Math.floor(a / b);
        }
       // System.out.print(result + " ");
        //System.out.print(round + " ");
        System.out.print(num  + " ");
    }

    public static void main(String[] args) {
        getRound(16717, 1960);
       getRound(6268925, 865);
       getRound(144275, -1168860);
        getRound(9715, 1556);
        getRound(13011, 580);
       // getRound(5015 ,616);
        getRound(-9501728, 4159160);
        //getRound(4642694, 390);
       // getRound(-8120830 ,4146023);
        getRound(9986522, -4447252);
        getRound(15165 ,1760);
        getRound(16561 ,1096);
        getRound(11041, 1910);
    }
}
