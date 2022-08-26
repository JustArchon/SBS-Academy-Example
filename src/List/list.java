package List;

import java.util.ArrayList;
import java.util.LinkedList;

public class list {
    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0] = 10;
        for (int i = 0, j = 1; i < arr.length; i++, j++){
            arr[i] = j;
        }
        for (int num : arr){
            System.out.println(num);
        }
        ArrayList<String> test = new ArrayList<>();
        test.add("a");
        test.add("B");
        test.add("C");
        test.add(0,"1");
        System.out.println(test);
        test.remove(0);
        System.out.println(test);
        System.out.println(test.get(0));
        System.out.println(test.size());
        System.out.println(test.indexOf("B"));
        System.out.println(test.indexOf("0"));
        System.out.println(test.contains("a"));
        test.clear();
        System.out.println(test);

        LinkedList<String> test2 = new LinkedList<>();
        test2.add("A");
        test2.add("B");
        System.out.println(test2);
    }
}
