import java.util.*;
public class Diagonal{
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
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){
                if(i==j || i+j==n-1){
                    System.out.print(arr[i][j]+" "); 
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        } 
    }
}