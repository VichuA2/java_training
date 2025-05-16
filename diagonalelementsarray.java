import java.util.Scanner;
class DiagonalSum{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt(),sum=0,sum1=0;
        int[][] arr=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=s.nextInt();
        }
        }
        for(int i=0;i<n;i++)
        {
            int c=(n-1)-i;
            for(int j=0;j<m;j++){
            if(i==j){
                sum+=arr[i][j];
            }
            if(j==c)
            {
                sum1+=arr[i][j];
            }
        }
    }
    System.out.println(sum-sum1);
    }
}
