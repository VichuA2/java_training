import java.util.*;

public class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
    }
}

public class LL {
    Node head;
    Node tail;
    int size;

    LL() {
        this.size = 0;
    }

    void set(int x) {
        Node node = new Node(x);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

class LinkedList6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LL list = new LL();

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int z = s.nextInt();
            list.set(z);
        }

        if (list.head != null && list.head.next != null && list.head.next.next != null) {
            list.head.next.next.next = list.head;  
        }

        System.out.println("Loop detected: " + list.hasLoop());
        s.close();
    }
}
