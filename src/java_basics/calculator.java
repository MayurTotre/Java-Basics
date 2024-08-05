import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        // building a calculator

        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.print("Enter an operator: ");
            char ch = sc.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.print("Enter 2 numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
            
                if(ch == '+'){
                    ans = a+b;
                }
                else if(ch == '-'){
                    ans = a-b;
                }else if(ch == '*'){
                    ans = a*b;
                }else if(ch == '/'){
                    ans = a/b;
                }else if(ch == '%'){
                    ans = a%b;
                }

            } else if (ch == 'x' || ch == 'X') {
                break;
                
            }else{
                System.out.println("Not a valid operator!");
            }
            System.out.println(ans);


        }


    }
}
