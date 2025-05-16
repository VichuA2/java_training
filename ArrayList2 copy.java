import java.util.*;
public class Set{ 
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        ArrayList <Integer> a1=new ArrayList<>();
        ArrayList <Integer> a2=new ArrayList<>();
        a1.add(3);
        a1.add(2);
        for(int i=0;i<n;i++){
            a1.add(s.nextInt());
        }
        for(int num:a1){
            if(!a2.contains(num)){
                a2.add(num);
            }
        }
        System.out.println(a1);
        System.out.println(a1.size()); 
        System.out.print(a2);
    }
} 