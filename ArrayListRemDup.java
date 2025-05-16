import java.util.*;
public class ArrayListRemDup{ 
    public static void main(String args[])
    {
        ArrayList <String> a1=new ArrayList<>();
        ArrayList <String> a2=new ArrayList<>();
        a1.add("Hi");
        a1.add("Hello");
        a1.add("Hi");
        a1.add("Are");
        a1.add("You");
        for(int i=0;i<a1.size();i++){
            if(!a2.contains(a1.get(i))){
                a2.add(a1.get(i));
            }
        }
        System.out.print(a2);
    }
}