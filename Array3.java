import java.util.Arrays;
import java.util.Scanner;
public class Array3 {
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
        
        for(int i=1;i<n;i++)
        {
            if(i==1)
            {
                arr1[i]=arr[i]*arr[i+1];
            }
			else if(i==(n-1)){
				arr1[i]=arr[i-1]*arr[i-2];
			}
            else{
                arr1[i]=arr[i-1]*arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
