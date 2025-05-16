import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=n;
        int re,count=0,rev=0,c=0,rem,r,an=0;
        while(n!=0){
            n/=10;
            count++;
        }
        for (int i = 1; i <=count; i++) {
            c+=1;
            rem=x%10;
            if(c==count || c==1){
                rev=rev*10+rem;
            }
            x/=10;
        }
        while(rev!=0){
            r=rev%10;
            an=an*10+r;
            rev/=10;
        }
        System.out.println(an);
    }

}
