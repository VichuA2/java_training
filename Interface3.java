import java.util.*;
interface Father{
    void display();
}
interface Mother{
    void display();
}
class Documents implements Father,Mother{
    public void display(){
        System.out.println("Appa \nAmma");
    }
}
class Interface3{
    public static void main(String args[]){
        Documents s=new Documents();
        s.display();
    }
}
