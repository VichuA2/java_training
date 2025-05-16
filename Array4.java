import java.util.*;

public class Array4 {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int sum=0;
        int tsum=0;
        for(int i=0;i<k;i++){
            tsum+=arr[i];
        }
        sum+=tsum;
        for(int i=k;i<n;i++){
            tsum+=arr[i]-arr[i-k];
            sum=Math.max(tsum,sum);
        }
        System.out.println(sum);
    }
}
