package java_basics6;

public class ThreadExample{
    public static void main(String[] args) {
        ThreadOne One = new ThreadOne();
        ThreadTwo Two = new ThreadTwo();

        Thread one  = new Thread(One);
        Thread two  = new Thread(Two);

        one.start();
        two.start();

    }
}

class ThreadOne implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is from thread one: " + i);
        }
    }
}
class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <15; i++) {
            System.out.println("This is from thread two: " + i);
        }
    }
}