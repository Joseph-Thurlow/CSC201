package Week_2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test3 {

    public static void largest(List<Integer> arr) {
        long startTime = System.nanoTime();

        Collections.sort(arr);
        for(int i=1; i<11; i++) {
            System.out.println(arr.get(arr.size() - i));
        }


        long endTime   = System.nanoTime();
        System.out.println("Time: " + (endTime - startTime));
    }
    public static void main(String[ ] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        largest(arr);
    }
}
