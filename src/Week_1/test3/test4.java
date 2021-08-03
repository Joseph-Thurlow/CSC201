package Week_1.test3;

import java.util.LinkedHashMap;

public class test4 {
    public static void repeatCount(String input) {
        LinkedHashMap<String, Integer> list = new LinkedHashMap<String, Integer> ();
        String[] opList = input.split("\\s+");

        for(String x : opList) {
            if(!list.containsKey(x)) {
                list.put(x, 1);
            } else {
                list.put(x, list.get(x) + 1);
            }
        }

        System.out.println(list);
    }

    public static void main(String[ ] args) {
        String input = "This is a Week_1.test3.test String to Week_1.test3.test if the String counter works.";
        repeatCount(input);
    }

}
