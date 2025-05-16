import java.util.Scanner;
class Building{
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
        if(arr[0]<arr[n-1]){
        for(int i=1;i<=n-2;i++){
            if(arr[i]<arr[0]){
                int m=arr[0]-arr[i];
                count+=m;
            }
        }
        }
        else{
            for(int j=n-2;j>=1;j--){
                if(arr[j]<arr[n-1]){
                    int m=arr[n-1]-arr[j];
                    count+=m;
                }
            }
        }
        System.out.print(count);
    }
}