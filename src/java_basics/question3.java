public class question3 {
    public static void main(String[] args) {
        // Reverse a number in java
        int num = 12345;
        int ans = 0;
        while(num>0){
            int rem = num % 10;
            num = num/10;
            ans = ans * 10 +rem;
        }
        System.out.println(ans);

    }
}
