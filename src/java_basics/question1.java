import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is max");
        }
        else if (b>a && b>c){
            System.out.println(b + " is max");
        }
        else {
            System.out.println(c+ " is max");
        }
    }
}
