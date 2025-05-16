import java.util.Scanner;
class LeadingTrailing{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a=s.nextInt();
        String s1=Integer.toBinaryString(a);
        int c=0;   
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)=='0'){
                c++;
            }
            else{
                break;
            }
        }
        System.out.println("Leading zeros : "+(32-s1.length()));
        System.out.println("Trailing zeros : "+c);
        

        // USING PREDEFINED FUNCTION:
        // int count=0;
        // while((n&1)==0 && n!=0){
        //     count++;
        //     n>>=1;
        // }   
        // System.out.print("Trailing"+count);
        // int count1=0;
        // for(int  i=31;i>=0;i--){
        //     if((n&(1<<i))==0){
        //         count1++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // System.out.print("Leading"+count1);
        
    }
}