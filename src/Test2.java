import java.util.*;

public class Test2 {

    private static void swap(char[] e, int a, int b) {
        char tmp = e[a];
        e[a] = e[b];
        e[b] = tmp;
    }

    private static void printArray(char[] e) {
        for(int i = 0; i < e.length; i++) {
            System.out.print(e[i]);
        }
        System.out.print("\n");
    }

    public static void calculate(int n, char[] e) {
        if(n == 1) {
            printArray(e);
        } else {
            for(int i = 0; i < n-1; i++) {
                calculate(n - 1, e);
                if(n % 2 == 0) {
                    swap(e, i, n-1);
                } else {
                    swap(e, 0, n-1);
                }
            }
            calculate(n - 1, e);
        }
    }

    public static void main(String[ ] args) {
        char[] arr = {'c', 'a', 't', 'd', 'o', 'g'};
        calculate(6, arr);
    }
}
