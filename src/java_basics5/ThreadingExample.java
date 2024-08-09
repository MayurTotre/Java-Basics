package java_basics5;

public class ThreadingExample {
     public static void main(String[] args) {
            // Create instances of the two threads
            ThreadHii threadHii = new ThreadHii();
            ThreadHello threadHello = new ThreadHello();

            // Set priorities
            threadHii.setPriority(Thread.NORM_PRIORITY); // Default priority
            threadHello.setPriority(Thread.MAX_PRIORITY); // High priority

            // Start the threads
            threadHii.start();
            threadHello.start();
        }
    }

    class ThreadHii extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(500); // Optional: sleep to see the output more clearly
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ThreadHello extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500); // Optional: sleep to see the output more clearly
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }