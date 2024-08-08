package java_basics4;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,3,2,3,4,5,3,2,2,1);
        Question2.RemoveDup(list);
    }
    public static void RemoveDup(List<Integer> inputList){
        Set<Integer> set = new HashSet<>();
        for (Integer a : inputList){
            set.add(a);
        }

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
