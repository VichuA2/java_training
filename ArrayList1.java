import java.util.*;
public class ArrayList1{ 
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        ArrayList <Integer> a1=new ArrayList<>(2);
        for(int i=1;i<=n;i++){
            a1.add(s.nextInt());
        }
        a1.add(67);
        a1.add(223);
        System.out.print(a1);
        System.out.print(a1.size());  

        // ArrayList <String> a1=new ArrayList<>();
        // a1.add("Hi");
        // a1.add("Hello");
        // a1.add("How");
        // a1.add("Are");
        // a1.add("You");
        // System.out.println(a1);
        // a1.remove(1);
        // System.out.println(a1);
        // System.out.println(a1.get(3));
        // System.out.println(a1.size());
        // System.out.println(a1.get(2));
    }
}