public class car1 { 
    String brand;
    int year;
    public car1(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    public void DisplayCarInfo(){
        System.out.println("car brand"+brand);
        System.err.println("manufacturer:"+year);
    }
    public static void main(String[] args) {
        car1 mycar=new car1("BMW",1995);
        mycar.DisplayCarInfo();
    }
    
}
