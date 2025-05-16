import java.util.*;
public class CountOddEven{
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
        int eCount=0;
        int oCount=0;
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){
                if(arr[i][j]%2==0){
                    eCount++; 
                }
                else{
                    oCount++;
                }
            }
        }
        System.out.println("Even Numbers : "+eCount);  
        System.out.println("Odd Numbers : "+oCount);  
    }
}