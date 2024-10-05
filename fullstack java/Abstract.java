abstract class Animal {
    abstract void sound();

    public void sleep() {
        System.out.println("the animal is sleeping");
    }

}

class dog extends Animal {
    public void sound() {
        System.out.println("the dog barks");
    }
}

class cat extends Animal {
    public void sound() {
        System.out.println("cat meow");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal mydog = new dog();
        Animal mycat = new cat();

        mydog.sound();
        mycat.sound();

        mydog.sleep();
        mycat.sleep();
    }
}