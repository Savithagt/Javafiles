import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        int p=sc.nextInt();
        System.out.println("enter the time");
        int t=sc.nextInt();
        System.out.println("enter the rate");
        int r=sc.nextInt();
        int SI;
        SI=p*t*r/100;
        System.out.println("SI="+SI);
    }
    
}
