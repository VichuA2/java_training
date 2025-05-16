import java.util.Scanner;
public class Harshad {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),x=n,sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        if(x%sum==0){
            System.out.println("It is an Harshad Number !");
        }
        else{
            System.out.println("It is Not an Harshad Number !");
        }
    }
    
}
