import java.util.Scanner;
class DcimalToBinary{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //System.out.print(Integer.toBinaryString(a));
        String str="";
        if(a==0){
            str="0";
        }
        else{
            while(a>0){
                int rem=a%2;
                str=rem+str;
                a/=2;
            }
        }
        System.out.println(str);
    }
}