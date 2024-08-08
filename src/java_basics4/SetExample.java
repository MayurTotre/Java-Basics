package java_basics4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
//        Set<Integer> list = new HashSet<>();
//        Set<Integer> list = new LinkedHashSet<>();
          Set<Integer> list = new TreeSet<>();
        list.add(10);
        list.add(10);
        list.add(30);

        System.out.println(list);

        list.remove(10);

        System.out.println(list);
    }
}
