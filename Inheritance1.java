import java.util.Scanner;

//Single Inheritance

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
public class Inheritance1 {
    
    public static void main(String args[])
    {
        B ans=new B();
        ans.print();
        ans.print1();

    }
}