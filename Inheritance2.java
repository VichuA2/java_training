import java.util.Scanner;

//Multilevel Inheritance

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
class C extends B{
    void print2(){
        System.out.println("How are you");
    }
}
public class Inheritance2{
    
    public static void main(String args[])
    {
        C ans=new C();
        ans.print();
        ans.print1();
        ans.print2();
    }
}