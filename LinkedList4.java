// import java.util.*;
// class LL {
//     Node head;
//     Node tail;
//     int size;
//     public LL(){
//         this.size=0;
//     }

//     public void InsertFirst(int n){
//         if(head==null){
//             head=tail;
//         }
//         Node node=new Node(n);
//         node.next=head;
//         head=node;
//         size++;
//     }

//     public void InsertLast(int n){
//         if(tail==null){
//             tail=head;
//         }
//         Node node=new Node(n);
//         tail.next=node;
//         tail=node;
//         size++;
//     }

//     void InsertCenter(int n,int pos){
//         if(pos==0){
//             InsertFirst(n);
//             return;
//         }
//         if(pos==size){
//             InsertLast(n);
//             return;
//         }
//         Node temp=head;
//         for(int i=1;i<pos;i++){
//             temp=temp.next;
//         }
//         Node node=new Node(n,temp.next);
//         temp.next=node;
//         size++;
//     }
//     void Display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.value+" ");
//             temp=temp.next;
//         }
//     }
// }
// class Node{
//     int value;
//     Node next;

//     Node(int v){
//         this.value=v;
//     }
//     Node(int v,Node n){
//         this.value=v;
//         this.next=n;
//     }
// }
// public class LinkedList4{
//     public static void main(String[] args){
//         LL list=new LL();
//         list.InsertFirst(30);
//         list.InsertFirst(20);
//         list.InsertFirst(10);
//         list.InsertLast(60);
//         list.InsertLast(70);
//         list.InsertLast(80);
//         list.InsertCenter(40,3);
//         list.InsertCenter(50,4);
//         list.Display();
//     }
// }



import java.util.*;
class LL {
    Node head;
    Node tail;
    int size;
    public LL(){
        this.size=0;
    }

    public void Insert(int n){
        Node node=new Node(n);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=null;
        node.prev=tail;
        tail=node;
        size++;
    }

    void Display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.value+" ");
                temp=temp.next;
            }while(temp!=head);
        }
    }
}
class Node{
    int value;
    Node next;
    Node prev;
    Node(int v){
        this.value=v;
    }
}
class LinkedList4{
    public static void main(String[] args){
        LL list=new LL();
        list.Insert(30);
        list.Insert(20);
        list.Insert(10);
        list.Insert(60);
        list.Insert(70);
        list.Insert(80);
        list.Display();
    }
}
