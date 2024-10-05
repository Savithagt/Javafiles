import java.util.Scanner;

public class posneg  {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scanner.nextInt();
 
        if(num>=0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative"); 
        }
    }

    
}
