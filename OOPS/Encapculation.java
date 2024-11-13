  class Student{
    // private memeber does not access by any other class method it access by only the same class member
    private String name;
    private int age;
        // getter and setters are used in the encapsulation to get access the private member
     String getName(){
        return name;
    }
    // this keyword refers to the private members to give acces the values
    public void  setName(String name){
        this.name=name;
    }
     int getAge(){
        return age;
    }
    public void  setAge(int age){
        this.age=age;
    }

}

public class Encapculation {
    
    public static void main(String[] args) {
        
       Student obj=new Student();
       obj.setName("John");
       obj.setAge(3);
       System.out.println(obj.getName()+" :"+obj.getAge());

    }
}
