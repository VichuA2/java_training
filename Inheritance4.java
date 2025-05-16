import java.util.Scanner;

//Problem statement.

class Employee{
    String eName;
    String eId;
    Employee(String name,String id){
        this.eName=name;
        this.eId=id;
    }
    void display(){
        System.out.println("Role: Employee");
        System.out.println("Name: "+eName);
        System.out.println("Id: "+eId);
        System.out.println();
    }
}
class Manager extends Employee{
    int tSize;
    String dep;
    Manager(String name,String id,int size,String dept){
        super(name,id);
        this.tSize=size;
        this.dep=dept;
    }
    void display(){
        super.display();
        System.out.println("Role: Manager");
        System.out.println("Team Size: "+tSize);
        System.out.println("Department: "+dep);
        System.out.println();
    }
}
class Developer extends Employee{
    String project;
    String pLang;
    Developer(String name,String id,int size,String dept,String pro,String lang){
        super(name,id);
        this.pLang=lang;
        this.project=pro;
    }
    void display(){
        super.display();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: "+pLang);
        System.out.println("Project: "+project);
        System.out.println();
    }
}
public class Inheritance4{
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        String  id=s.nextLine();
        int size=s.nextInt();
        s.nextLine();
        String dept=s.nextLine();
        String pro=s.nextLine();
        String lang=s.nextLine();
        
        Employee e=new Employee(name,id);
        e.display();
        Manager m=new Manager(name,id,size,dept);
        m.display();
        Developer d=new Developer(name,id,size,dept,pro,lang);
        d.display();
    }
}