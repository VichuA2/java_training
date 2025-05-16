import java.util.Scanner;
public class HowFactor {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count =0;
        while(n!=1){
            if(n%2==0){
                n/=2;
                count++;
            }
            else{
                n=n*3+1;
                count++;
            }
        }
        System.out.println(count);
    }
}
