package java_basics6;

import java.util.concurrent.ThreadLocalRandom;

public class DaemonThread {
    public static void main(String[] args) {
        Thread bgThread = new Thread(new DaemonHelper());
        Thread user = new Thread(new UserThread());

        bgThread.setDaemon(true);
        bgThread.start();
        user.start();



    }
}

class DaemonHelper implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while(count < 100){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon thread is Running!");

        }
    }
}

class UserThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User Thread is started!");
    }
}
