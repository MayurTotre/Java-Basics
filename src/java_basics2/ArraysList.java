package java_basics2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> names = new ArrayList<>(10);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        names.add(22);
        System.out.println(names);
        System.out.println(names.get(10));;
        names.set(1,9);
        System.out.println(names.get(1));
        System.out.println(names.size());
    }
}
