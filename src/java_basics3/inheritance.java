package java_basics3;

public class inheritance {
    public static void main(String[] args) {
        Lion obj = new Lion("Simba", 5, "Golden");
        elephant obj2 = new elephant("dumbo", 10, 25);
        obj.makeSound();
        System.out.println(obj.toString());

        obj2.makeSound();
        System.out.println(obj2.toString());
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some sound");
    }

    public String getName(String name) {
        return name;
    }

    public int getAge(int age) {
        return age;
    }
}
class Lion extends Animal {
    String manecolor;

    public Lion(String name, int age, String manecolor) {
        super(name, age);
        this.manecolor = manecolor;
    }

    @Override
    public void makeSound() {
        System.out.println(" Roar!!");

    }

    @Override
    public String toString() {
        return "Lion{" + "manecolor='" + manecolor + '\'' + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
class elephant extends Animal {
    int trunklength;

    public elephant(String name, int age, int trunklength) {
        super(name, age);
        this.trunklength = trunklength;
    }

    @Override
    public void makeSound() {
        System.out.println(" Trumpet");
    }

    @Override
    public String toString() {
        return "elephant{" + "trunklength=" + trunklength + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
