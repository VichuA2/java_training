import java.util.*;
class Node{
    private int val;
    private Node next;
    Node(int n){
        val=n;
    }
    Node(int n,Node p){
        val=n;
        next=p;
    }

    public void Insert(int n){

    }
    public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data+" ");
            current=current+next;
        }
    }
}
public class LinkedList1 { 
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        Main m=new Main();
        for(int i=0;i<d;i++)
        {
            int n=s.nextInt();
            Node newnode=new Node(n);
            if(m.head == null)
            {
                m.head=newnode;
            }
            else
            {
                newnode.next=m.head;
            }
            }
        }
    }

