//package LINKEDLISTS;

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

    void insertIthp(int p, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        int c = 0;
        if (p == 0) {
            newNode.next = head;
            head = newNode;

        } else {
            while (temp.next != null) {
                if (c == p) {
                    newNode.next = temp.next;
                    temp.next = newNode;

                    break;
                }
                temp = temp.next;
                c++;

            }
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

public class LL {

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
        ll.insertIthp(sc.nextInt(), sc.nextInt());

        ll.print();

    }
}