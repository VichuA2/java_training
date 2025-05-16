import java.util.Arrays;
import java.util.Scanner;
public class Matrix2d2{ 
    public static void main(String args[])
    {
        //Upper Traingular Matrix
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i<=j){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}