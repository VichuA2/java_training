import java.util.*;
public class ArrayListMerge{ 
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        ArrayList <Integer> a1=new ArrayList<>();
        ArrayList <Integer> a2=new ArrayList<>();
        for(int i=0;i<n;i++){
            a1.add(s.nextInt());
        }
        for(int i=0;i<n;i++){
            a2.add(s.nextInt());
        }
        System.out.println(a1.size());
        System.out.println(a2.size());
        // for(int num:a2){
        //     a1.add(num);
        // }
        ArrayList <Integer> a3=new ArrayList <>(a1);
        a3.addAll(a2);
        System.out.println(a1);
        System.out.println(a1.size()); 
        System.out.print(a2);
        System.out.println(a2.size());
        System.out.print(a3);
    }
} 