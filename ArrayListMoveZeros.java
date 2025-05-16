import java.util.*;
public class ArrayListMoveZeros{ 
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        ArrayList <Integer> a1=new ArrayList<>();
        ArrayList <Integer> a2=new ArrayList<>();
        for(int i=0;i<n;i++){
            a1.add(s.nextInt());
        }
        System.out.print(a1);
        int count=0;
        for(int num:a1){
            if(num!=0){
                a2.add(num);
            }
            else{
                count++;
            }
        }
        for(int i=1;i<=count;i++){
            a2.add(0);
        }
        System.out.print(a2);
    }
}