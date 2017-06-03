import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Анастасия on 15.10.2016.
 */
public class Main {
           public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> vals = new ArrayList<Integer>();

            int size = Integer.parseInt(in.nextLine());

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 3; j++) {
                    vals.add(in.nextInt());
                }
                Collections.sort(vals);
                System.out.print(vals.get(1) + " ");
                vals.clear();
            }

        }
    }