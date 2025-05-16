import java.util.Arrays;
import java.util.Scanner;
public class Matrix2d5{ 
    public static void main(String args[])
    {
        //Toeplitz Matrix
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();
        boolean ans=true;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(arr[i][j]!=arr[i-1][j-1]){
                    ans=false;
                }
            }
        }
        if(ans){
            System.out.println("Toeplitz");
        }
        else{
            System.out.println("Not Toeplitz");
        }
    }
}
