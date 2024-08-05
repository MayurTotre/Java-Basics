import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
//    String fruit = "";
    Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
//    fruit = sc.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits!");
//            case "Apple" -> System.out.println("A sweet red fruit!");
//            case "grapes" -> System.out.println("small fruit!");
//            case "orange" -> System.out.println("round fruit!");
//            default -> System.out.println("Enter a valid input1!");
//        }

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid input");
        }
    }

}
