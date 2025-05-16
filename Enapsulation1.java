import java.util.*;
class Student1{
    private int Id ;
    private String Name;
    private String Dep;

    //Setter                                                                                                                                                                                                       
    void setValues(int st_Id,String st_Name,String st_Dep){
        Id=st_Id;
        Name=st_Name;
        Dep=st_Dep;
    }

    //Getter
    int getId(){
        return Id;
    }
    String getName(){
        return Name;
    }
    String getDep(){
        return Dep;
    }
}
class Enapsulation1 {
    public static void main(String[] args) {
        {
            Student1 o=new Student1();
            o.setValues(123,"Sam","AI");
            System.out.println(o.getId());
            System.out.println(o.getName());
            System.out.println(o.getDep());
        }
    }
}
