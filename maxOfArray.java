import java.util.Arrays;
import java.util.Collections;

public class maxOfArray {
    public static void main(String[] args) {
        Integer[] numbers ={45,546,2432,573};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.print( max + " ");
        System.out.print( min);

    }
}