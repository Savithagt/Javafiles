 class bird { 
    void fly(){
        System.out.println("bird can fly");
    }
    class Parrot extends bird{
        void color(){
            System.out.println("i am green");
        }
    } 
   // class singleparrot extends Parrot{
       // void sing(){
          //  System.out.println("i am sing");
     //   }
  //  }
  class cow extends bird{
    void whatcoloriam(){
        System.out.println("i am black")
    }
  }


        
    
    public class Main{
        
        public static void main(String[] args) { 
            Parrot p = new Parrot();
            cow s =new cow();
            s.whatcoloriam();
          //  p.sing();
            s.fly();
            p.color();
        }
    }
}



    


        
    

    

