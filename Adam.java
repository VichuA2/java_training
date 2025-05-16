import java.util.*;
public class Adam {

    static int rev(int x){
        int r,re=0;
        while(x!=0){
            r=x%10;
            re=re*10+r;
            x/=10;
        }
        return re;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sq=(int)Math.pow(n,2);
        int resq=(int)Math.pow(rev(n),2);
        if(sq==rev(resq)){
            System.out.print("Adam Number");
        }
        else{
            System.out.print("Not an Adam Number");
        }
    }
}
