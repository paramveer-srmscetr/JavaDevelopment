
class Calc{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int a , int b){
System.out.println(a-b);
    }
}

class AdvnCalc extends Calc{
    public void mult(int a,int b){
System.out.println(a*b);
    }
}

// does not support the multi inheritance example  --
// class A extends calc,AdvanCalc{

// }

// method overloading== which obj class is call it give the priority to itself
//mutlilevel inheritance and method overloading
class A extends AdvnCalc{
    public void mult(int a,int b){
System.out.println(a*b);
    }
}

public class Inherit {
    public static void main(String[] args) {
         A obj=new A();
            obj.add(2, 3);        // this is inheritance because we can acess the method of another class without deifne it 
            obj.mult(4, 6);
    }
}
