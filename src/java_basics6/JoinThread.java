package java_basics6;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread1 : " + i);
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread2 : " + i);
            }

        });

        one.start();
        two.start();
        one.join();
        System.out.println("done with threads");
    }

}
