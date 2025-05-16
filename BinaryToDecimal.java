import java.util.Scanner;
class BinaryToDecimal{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        //System.out.print(Integer.toparseInt(a,2));
        int n=0; 
        int p=0;
        for(int i=str.length()-1;i>=0;i--){
            n+=(Character.getNumericValue(str.charAt(i)))*((int)Math.pow(2,p));
            p++;
        }
        
        System.out.println(n);
    }
}