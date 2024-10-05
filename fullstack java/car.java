 class car{
    private String modelName;
    private String owner;
    private int regnumber;

    public car(String modelName,String owner,int regnumber){
    
    }    public void startEngine(){
            System.out.println("car can be started..");
        }
        public void accelarate(){
            System.out.println("car can be accelarated");
        }
        public void stop(){
            System.out.println("car can be stopped");
        }
    

        public void showCarInformation(){
            System.out.println("the car is owned by"+owner);
            System.out.println("the car model is"+modelName);
            System.out.println("the regnumber is"+regnumber);
        }


        public static void main(String[] var0){
            car myCAr=new car ("Suzuki","rohan",1234);
            myCAr.startEngine();
            myCAr.accelarate();
            myCAr.stop();
            myCAr.showCarInformation();
        }
    }
    
    

