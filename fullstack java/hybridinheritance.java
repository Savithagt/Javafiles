public class hybridinheritance {
    public static void main(String[] args) { 
        D obj =new D();
        
    }

    

//super class
class A{
    int a=1;
}
class B extends A{
    int b=2;
}
 interface C{
    int c=3;
 }
 //extend and implementation together
 class D extends B implements C{
    int d=4;
    int sum=a+b+c+d;
    public void Display(){
        System.out.println("the value of a is"+a);
        System.out.println("the value of a is"+b);
        System.out.println("the value of a is"+C.c);
        System.out.println("the value of a is"+d);
        System.out.println("the sum is" +sum);

    }
 }
}

