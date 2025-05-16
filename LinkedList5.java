import java.util.*;

class Linked{
  Node head;
  Node tail;
  int size;
  Linked(){
    this.size=0;
  }
  void set(int x){
    Node node=new Node(x);
    node.next=head;
    head=node;
    if(head==null){
      tail=head;
    }
    size++;
  }
  void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
}
class Node{
  int data;
  Node next;
  Node(int d){
    this.data=d;
  }
}
class LinkedList5{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Linked  list =new Linked();
    int n=s.nextInt();
    for(int i=0;i<n;i++){
      list.set(s.nextInt());
    }
    list.display();
  }
}