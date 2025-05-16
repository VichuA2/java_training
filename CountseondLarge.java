import java.util.*;

public class CountseondLarge {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a],count=0;
        int in=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
            if(arr[i]!=arr[a-1] && arr[i]!=arr[j]){
                count++;
            }           
        } 
        }
        System.out.println(count);
    }
}
