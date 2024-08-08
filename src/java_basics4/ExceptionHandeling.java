package java_basics4;

public class ExceptionHandeling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        try{
//            int c = a/b;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("This will always execute");
//        }
//
        System.out.println(Add.sum(6,0));

    }
    static class Add{
        static int sum(int a, int b){
            if(b==0){
                throw new ArithmeticException("please do not divide by zero!");
            }else{
                return (a/b);
            }
        }
    }
}
