

/*polymorphism - thats means a method has different functions and at different reqiurement
two type of polymorphism - compiletime/overloading/static
                            runtime/overriding/dynamic



*/


//compiletime -- same methods but different parameters


class calc{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
}


// runtime

class calca{
    System.out.println("parent class");
}

class A extends calc{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class B extends calc{
    public void add(int a,int b){
        System.out.println(a+b);
    }
} 




public class Main {
    public static void main(String[] args) {
       
          calc obj= new calc();
          calca obj= new calca();
          obj.add(2,3);
          obj.add(2,3,5);
          
          
          
    }
}
