package java_basics3;

public class singleton {
    public static void main(String[] args) {
        singleton obj = singleton.getInstance();
        singleton obbj = singleton.getInstance();
        System.out.println(obj);
        System.out.println(obbj);
    }
    private singleton(){

    }
    private static singleton instance;

    public static singleton getInstance() {
        if(instance == null){
             instance = new singleton();
        }
        return instance;
    }
}
