public class question2 {
    public static void main(String[] args) {
        // count the number of occurrences
        int n = 45536535;

        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 5){
            count = count + 1;}
            n = n /10;

        }
        System.out.println(count);
    }
}
