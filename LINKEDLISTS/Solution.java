package LINKEDLISTS;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head, tail;

    void EvenOdd() {
        LinkedList oddList = new LinkedList();
        LinkedList evenList = new LinkedList();
        Node temp = head;

        while (temp != null) {
            int dt = temp.data;
            if (dt % 2 == 0) {
                evenList.push(dt);
            } else {
                oddList.push(dt);
            }
            temp = temp.next;
        }

        if (oddList.head == null) {
            evenList.print();
        } else if (evenList.head == null) {
            oddList.print();
        } else {
            oddList.tail.next = evenList.head;
            oddList.print();
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            ll.push(n);
        }
        sc.close();
        ll.EvenOdd();
    }
}
