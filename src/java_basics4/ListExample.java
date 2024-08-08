package java_basics4;

import BankingApplication.BankDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
     public static void main(String[] args) {

          List<Integer> nums2 = new LinkedList<>();
          List<Integer> nums = new ArrayList<>();
          nums2.add(10);
          nums2.add(20);
          nums2.add(30);
          nums2.add(40);

//          System.out.println(nums2);

          nums2.addFirst(1);
          System.out.println(nums2);

          nums2.addLast(50);
          System.out.println(nums2);

          nums2.removeFirst();
          nums2.removeLast();
          System.out.println(nums2);


//          System.out.println("Arraylist: " +nums);

//          int firstelement = nums.get(0);
//          System.out.println(firstelement);

//          nums.set(2, 30);
//          System.out.println(nums);

//          nums.remove(2);
//          System.out.println(nums);

//          Boolean val = nums.contains(20);
//          System.out.println(val);



     }

}