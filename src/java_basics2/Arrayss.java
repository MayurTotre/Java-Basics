package java_basics2;
import java.util.Scanner;
import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[]arr = new int[5]
        String[] arr = new String[5];

//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for (int var: arr){
//            System.out.println(var);
//        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        System.out.println(Arrays.toString(arr));
        arr[1] = "Mayur";
        System.out.println(Arrays.toString(arr));

    }



}
