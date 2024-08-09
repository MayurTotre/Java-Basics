package java_basics5;

public class example2 {
    public static void main(String[] args) {
        Runnable messageTask = new messageTask();

        Thread t = new Thread(messageTask);
        t.start();

    }
}

class messageTask implements Runnable{
    @Override

    public void run() {
        String[] messages = {"Hello", "World", "java", "Multithreading", "Example"};
        for(String message: messages){
            System.out.println("Message = " + message);
            try{
                Thread.sleep(700);
            }catch(InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}
