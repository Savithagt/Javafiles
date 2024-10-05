 class animal {
    public void sound(){
        System.out.println("animal make sound");
    }
    
}
class dog extends animal{
    public void sound(){
        System.out.println("the dog can barks");
    }
}
class cat extends animal{
    public void sound(){
        System.out.println("the cat moves");
    }
}
public class override{
    public static void main(String[] args) {
        animal myanimal=new animal();
        animal mydog=new dog();
        animal mycat=new cat();

        myanimal.sound();
        mydog.sound();
        mycat.sound();

        
    }
}