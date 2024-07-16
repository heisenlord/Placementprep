import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LL {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.printList(); // Output should be: 1 2 3
    }
}
