import java.util.*;

public class Keprekar {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt(),rev=n*n,re=rev,count=0;
        while(rev!=0){
            rev/=10;
            count++;
        }
        if(n==1){
            System.out.print("Keprekar");
        }
        int m=0;
        if(count%2==0){
            m=count/2;
            int l=re/(int)Math.pow(10,m);
            int r=re%(int)Math.pow(10,m);
            if((l+r)==n){
                System.out.print("Keprekar");
            }
            else
            {
                System.out.print("Not Keprekar");
                }
        }
        else{
            m=count/2;
            int l=re/(int)Math.pow(10,m);
            int r=re%(int)Math.pow(10,m);
            if((l+r)==n){
                System.out.print("Keprekar");
            }
            else{
                m+=1;
                l=re/(int)Math.pow(10,m);
                r=re%(int)Math.pow(10,m);
                if((l+r)==n){
                System.out.print("Keprekar");
                }
                else
                {
                System.out.print("Not Keprekar");
                }
            }
        }
    }
   
}
