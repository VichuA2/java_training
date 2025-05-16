import java.util.*;
interface College{
    void Classroom();
}
class Student implements College{
    public void Classroom(){
        System.out.println("Bharani");
    }
}
class Teacher implements College{
    public void Classroom(){
        System.out.println("Teacher attends the Classroom to teach");
    }
}
class Interface1{
    public static void main(String args[]){
        College s=new Student();
        College t=new Teacher();
        s.Classroom();
        t.Classroom();
    }
}
