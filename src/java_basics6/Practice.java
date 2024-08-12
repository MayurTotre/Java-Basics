package java_basics6;

import java.io.Flushable;
import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(list1);
        list2.add(5);
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println(list2);

        List<Integer> list3 = list2.subList(0,4);
        System.out.println(list3);
        list3.set(1,100);
        System.out.println(list3);
        System.out.println(list2    );


    }
}
