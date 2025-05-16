import java.util.*;
public class Add2dArray{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        int arr[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int arr1[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+arr1[i][j]+" ");
            }
            System.out.println();  
        }


        //sum of 2d array
        int sum=0;
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            } 
        }
        System.out.println("Sum of an array : "+sum); 
    }
}