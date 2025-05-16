import java.util.Scanner;

//Hierarchical Inheritance

class A{
    void print(){
        System.out.println("Hi");
    }  
}
class B extends A{
    void print1(){
        System.out.println("Hello");
    }
}
class C extends A{
    void print2(){   
        System.out.println("How are you");
    }
}
public class Inheritance3{
    
    public static void main(String args[])
    {
        C ans=new C();
        B an=new B();
        ans.print();
        an.print1();
        ans.print2();
    }
}