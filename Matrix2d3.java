import java.util.Arrays;
import java.util.Scanner;
public class Matrix2d3{ 
    public static void main(String args[])
    {
        //Symmetric Matrix(check Transpose)
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==arr[j][i]){
                    count++;
                }
            
            }
        }
        if(count==(r*c)){
            System.out.println("Transpose");
        }
        else{
            System.out.println("Not Transpose");
        }
    }
}