import java.util.Scanner;

public class LargeDigit {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max=0,re;
        while(n!=0){
            re=n%10;
            if(re>max){
                max=re;
            }
            n/=10;
        }
        System.out.println("Large Digit : "+max);
    }
}
