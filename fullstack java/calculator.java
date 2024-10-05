import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        int num3;
        System.out.println("enter your choice");
        int choice=sc.nextInt();


        switch(choice){
            case 1:
                num3=num1+num2;
                System.out.println(num3);
                break;
            case 2:
                num3=num1-num2;
                System.out.println(num3);
                break;
            case 3:
                num3=num1*num2;
                System.out.println(num3);
                break;
            case 4:
                num3=num1/num2;
                System.out.println(num3);
                break;

                

        }
    }
    
}
