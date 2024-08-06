package java_basics2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class functions {
    public static void main(String[] args) {
//        sum();
        String personalized = mygreet("Mayur");
        System.out.println(personalized);
        varargs(2,3,4,5,6,7,8);
    }

    private static String mygreet(String name) {
        return "Hello " + name;
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    static void varargs(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void varArgs(int a, int b, int ...v){
        System.out.println(Arrays.toString(v));
    }

}
