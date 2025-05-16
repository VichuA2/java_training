import java.util.*;
class Gcd{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a=s.nextInt();
        int b=s.nextInt();
        int gcd=0;
        for(int i=Math.min(a,b);i>0;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        System.out.print(gcd);
    }
}