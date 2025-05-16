import java.util.Scanner;
import java.util.*;
public class Happy {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),re;
        while(n!=1&&n!=4){
            int sum=0;
        while(n>0){
            re=n%10;
            sum+=(int)Math.pow (re,2);
            n/=10;
        }
        n=sum;
    }
    if(n==1){
        System.out.println("Happy");
    }
    }
}
