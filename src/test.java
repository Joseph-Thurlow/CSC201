import java.util.Arrays;
import java.util.Random;

public class test {

    public static void calculate() {
        Random r = new Random();
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1000) + 1;
        }

        Arrays.sort(arr);

        boolean different = true;
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
            if(arr[i] == arr[i+1]) {
                different = false;
            }
        }

        if(different) {
            System.out.println("Every value in the array is different.");
        } else {
            System.out.println("There are duplicate values in the array.");
        }
    }

    public static void main(String[ ] args) {

        calculate();
    }
}
