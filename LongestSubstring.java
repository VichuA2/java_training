import java.util.*;
class LongestSubstring{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        
        String s=sc.nextLine();
        int max1=0;
        for(int i=0;i<s.length();i++){
            String str="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(str.indexOf(ch)==-1){
                    str+=ch;
                    max1=Math.max(max1,str.length());
                }
                else{
                    break;
                }
            }
        }
        System.out.print(max1);
    }
}