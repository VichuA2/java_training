import java.util.*;
class Intersection{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a[]=new int[5];
        int b[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<5;i++){
            b[i]=s.nextInt();
        }
        System.out.println("__________");
        String str="";
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i]==b[j]){
                    str+=a[i];
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char x:str.toCharArray()){
            if(sb.indexOf(String.valueOf(x))==-1){
                sb.append(x);
            }
        }
        for(char y:sb.toString().toCharArray()){
            int num=Character.getNumericValue(y);
            System.out.println(num);
        }
    
    }
}