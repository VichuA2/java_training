import java.util.Scanner;

public class AsciiString {
    
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String s1=s.nextLine();
        int x[]=new int[s1.length()];
        char arr[]=s1.toCharArray();
        for(int i=0;i<s1.length();i++){
            for(int j=i;j<i+1;j++){
                x[i]=arr[j];
            }
        }
        for(int z:x){
        System.out.print(z+" ");
        }
        }
    }

