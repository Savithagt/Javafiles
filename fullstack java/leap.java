public class leap {
    public static void main(String[] args) {
        int year=2003;
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
        
    }
    
}
