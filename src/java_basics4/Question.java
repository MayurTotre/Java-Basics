package java_basics4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println("ORiginal list >> ");
        for (Integer n : list){
            System.out.println(n);
        }
        System.out.println();

        System.out.println("After removal of Duplicate >> ");
        List<Integer> list1 = Question.removeDup(list);
        for (Integer n : list1){
            System.out.println(n);
        }

    }
    public static List<Integer> removeDup(List<Integer> inputList) {
        for (int i = 0; i < inputList.size() - 1; i++) {
            if (inputList.get(i) == inputList.get(i + 1)) {
                inputList.remove(i + 1);
            }
        }
        return inputList;
    }
}
