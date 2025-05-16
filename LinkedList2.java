import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class LinkedList2 {
    Node head;
    void insertAtHead(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList2 m = new LinkedList2();

        System.out.print("Enter number of elements: ");
        int d = s.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < d; i++) {
            int n = s.nextInt();
            m.insertAtHead(n); 
        }
        System.out.println("Reversed Linked List:");
        m.print();
    }
}