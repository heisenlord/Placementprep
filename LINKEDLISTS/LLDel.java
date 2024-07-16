package LINKEDLISTS;

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head, tail;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    void deleteInd(int i) {
        if (i == 0) {
            head = head.next;
        }
        int c = 1;
        Node temp = head;
        while (temp != null) {
            if (c == i) {
                temp.next = temp.next.next;
                break;

            }
            temp = temp.next;
        }

    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}

public class LLDel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            ll.insert(n);
        }
        ll.deleteInd(sc.nextInt());
        ll.print();

    }
}