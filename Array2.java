import java.util.*;
public class Array2 {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int[] arr1=new int[n+1];
        System.out.println("Enter value:");
        int val=s.nextInt();
        System.out.println("Enter position:");
        int pos=s.nextInt();
        for(int i=n;i>=pos;i--)
        {
            if(i>pos)
            {
                arr1[i]=arr[i-1];
            }
            else{
                arr1[i]=val;
            }
        }
        for(int i=0;i<pos;i++)
        {
            arr1[i]=arr[i];
        }
        System.out.println("New array:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
