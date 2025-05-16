import java.util.*;

public class Array6 {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        {
            arr[i][j]=s.nextInt();
        }}
        for(int j=0;j<m;j++){
            for(int k=n-1;k>=0;k--){
            {
                System.out.print(arr[k][j]);
            }
        }
        System.out.println();
        }
    }
}
