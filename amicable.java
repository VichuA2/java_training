import java.util.Scanner;
public class amicable {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt(),n2=s.nextInt(),sum1=0,sum2=0;
        for(int i=1;i<=n1/2;i++){
            if(n1%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<=n2/2;i++){
            if(n2%i==0){
                sum2+=i;
            }
        }
        if(n1==sum2 && n2==sum1){
            System.out.println("It is an Amicable Pair !");
        }
        else{
            System.out.println("It is Not an Amicable Pair !");
        }
    }
}
