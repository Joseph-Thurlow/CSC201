package Week_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test2 {
    public static ArrayList<Integer> shuffle(ArrayList<Integer> list) {
        Random r = new Random();

        for(int i=list.size()-1; i > 0; i--) {
            int randIndex = r.nextInt(i);

            int temp = list.get(i);
            list.set(i, list.get(randIndex));
            list.set(randIndex, temp);
        }
        return list;
    }

    public static void main(String[ ] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<5; i++) {
            list.add(i);
        }
        System.out.println(shuffle(list));
    }
}
