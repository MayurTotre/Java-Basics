package java_basics7;

public interface A {
    void sum();
    default int multiply(int a, int b){
        return a*b;
    }

}

class Test implements A{
    @Override
    public void sum() {
        System.out.println("HIIIIII ");
    }

//    @Override
//    public int multiply(int a, int b) {
//        return a*a;
//    }
}
class Testing {
    public static void main(String[] args) {
//        Test t = new Test();
        A a = new Test();
        System.out.println(a.multiply(2,3));
//        t.sum();
//        System.out.println(t.multiply(10,5));
    }

}