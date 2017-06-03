import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Анастасия on 15.10.2016.
 */
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int weight = sc.nextInt();
            float height = sc.nextFloat();

            math(height, weight);

        }
    }

        static void math(float h,int w){

            float bmi = (float)w / (h * h);
            if (bmi < 18.5) {
                System.out.print("under" + " ");
            } else if ((bmi < 25) &&(bmi >= 18.5)) {
                System.out.print("normal" + " ");
            } else if ((bmi < 30) && (bmi >= 25)) {
                System.out.print("over" + " ");
            } else if (bmi >= 30) {
                System.out.print("obese" + " ");
            }
        }





}

