import java.util.*;

public class Array5 {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int max=0;
        int x=s.nextInt();
        while(x>=1)
        {
        int sum=0;
        for (int i = 0; i < n; i++)
        {
            sum+=i*arr[i];
        }
        int temp=arr[0];
        for(int j=0;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        arr[n-1]=temp;
        max=Math.max(max,sum);
        x--;
        System.out.print(Arrays.toString(arr));
    }

        System.out.print(max);

    }
}
