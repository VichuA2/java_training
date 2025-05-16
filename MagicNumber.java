import java.util.Scanner;
public class MagicNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>9){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println("It is an Magic Number !");
        }
        else{
            System.out.println("It is Not an Magical Number !");
        }
    }
}
