package java_basics2;

public class question2 {
    public static void main(String[] args) {
        //maximum value in an array

        int[] arr = {1,2,99, 3,4,55,5};
        System.out.println(max(arr));

    }
    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
