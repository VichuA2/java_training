import java.util.Scanner;
public class Function1 {
    static int sum(int a,int b){
        return  a+b;
    }

    static int subtract(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //s.nextLine();    
        int a=s.nextInt(),b=s.nextInt();
        System.out.print("Provide operaton to perform : ");
       
        s.nextLine();
        String op=s.nextLine(); 
        
                                                     
        if(op.equalsIgnoreCase("sum")){
           System.out.println("Sum : "+sum(a,b));
        }
        else if(op.equalsIgnoreCase("subtract")){
            System.out.println("Subtract : "+subtract(a,b));
        }
    }

    
}
