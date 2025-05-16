import java.util.*;
public class HashMap1{ 
    public static void main(String args[])
    {
        //HashMap
        HashMap <String,Integer> num=new HashMap<>();
        num.put("siva",10);
        num.put("saran",20);
        num.put("sanjai",30);
        System.out.println(num.get("saran"));
        num.remove("siva");
        System.out.println(num.containsKey("saran"));
        System.out.println(num.containsValue(20));
        System.out.println(num.size());
        System.out.println(num.isEmpty());
        num.clear();
        System.out.println(num.size());
        System.out.println(num.isEmpty());
    }
}