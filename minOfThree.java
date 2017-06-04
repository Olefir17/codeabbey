/**
 * Created by Admin on 01.05.2016.
 */
public class minOfThree {
    static int min;

    public static int getMin(int a, int b, int c){
            if(a<b && a<c){
                 min = a;
                System.out.print(min + " ");
            }
            else
                if(b<c && b<a){
                     min = b;
                    System.out.print(min + " ");
                }
            else
                if(c<a &&c<b){
                        min = c;
                        System.out.print(min + " ");
                }
            return   min;
        }

    public static void main(String[] args) {
        getMin(836613, 7112133, -2610987);
        getMin(5483201, -4470348, 5091432);
        getMin(6517537, 6951405, -8359028);
        getMin(-8143814, -8065498, 5495775);
        getMin(-7173718, -9333549, -6953453);
        getMin(4595579 ,-6795003, -5210147);
        getMin(-2081004, -471703, -8868619);
        getMin(6021022, 4544719, -874904);
        getMin(2900254, 1329528, -749900);
        getMin(-9933707, 230338, 7889865);
        getMin(-5485992, -8933048, 5001998);
        getMin(1903020, 6550152, -9468349);
        getMin(-3005548, 3067689, 7483055);
        getMin(-1364576, 4923875, 9417556);
        getMin(-5868801, 7750157, -9915992);
        getMin(-2822255, 2345737, -6710996);
        getMin(1967598, -9735267, 2817301);
        getMin(3098978, 6285754, -2637979);
        getMin(-7775925, -813991, 8691548);
        getMin(1474175, -747698, -1078113);
        getMin(-635960,3766309, -11162);
        getMin(-5633961, -4330671, -3461009);
    }
}
