class Person{
    private String name;
    private int age;


    public String getname(){
        return name;
    }
    public void setname(String name){
        if(name!=null && name.isEmpty()){
            this.name=name;
        }
        else{
            System.out.println("invalid name:"+name);
        }
 
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("invalid age:"+age);
        }
    }


}
public class encaptulation{
    public static void main(String[] args) {
        Person person=new Person();
        person.setname("Savitha");
        person.setage(20);

        System.out.println("name:"+person.getname());
        System.out.println("age:"+person.getage());

        person.setage(-5);
        
    }
}
    

