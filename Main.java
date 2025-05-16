import java .util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0;
        while(n!=0){
            rem+=n%10;
            n/=10;
        }
        System.out.println(rem);
    }
}