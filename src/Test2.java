public class Test2 {


    public static int perm(int val) {
        int result = 1;
        while(val > 0) {

            result *= val;
            val--;
        }

        return result;
    }


    public static void calculate() {
        char[] arr = {'c', 'a', 't', 'd', 'o', 'g'};

        
        
    }

    public static void main(String[ ] args) {
        System.out.println(perm(4));
    }
}
