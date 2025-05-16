import java.util.Scanner;
class Market {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int price,quantity,Total=0;
        do{
            System.out.print("Enter Price:");
            price=s.nextInt();
            if(price==0){
                break;
            }
            System.out.print("Enter Quantity:");
            quantity=s.nextInt();
            Total+=price*quantity;
        }while(price!=0);
        System.out.println("Total Price : "+Total);
    }
}
