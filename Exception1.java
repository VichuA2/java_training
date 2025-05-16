public class Exception1 {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        int c=0;
        try{
            c=b/a;
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}                                               