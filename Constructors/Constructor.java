 // the Human class also extends from the object class in java 

class Human  {

    int age;
    String name;

    // this is the constructor that call imedeiately on creating the object class
    public Human() {   //default constructor
        age = 10;
        name = "ishu";

    }
    // parameterized constructor
    public Human (int age, String name)
{
          this.age=age;
          this.name=name;
}
}

class Constructor  {

    public static void main(String[] args) {


        Human obj = new Human();
        Human obj1=new Human(5,"chauhan");
        System.out.println(obj.age + " " + obj.name);
        System.out.println(obj1.age + " " + obj1.name);
        

    }
}


// // super keyword is used for the calling parent call or methods
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         super.sound();  // Calls the superclass method
//         System.out.println("Dog barks");
//     }
// }
