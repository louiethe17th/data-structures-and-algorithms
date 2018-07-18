package day6;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

public class LinkedList {
    ListNode root;

    public LinkedList() {
        this.root = null;
    }

    public void prepend(int data) {
        ListNode nn = new ListNode(data);
        nn.next = this.root;
        this.root = nn;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        int total = 0;

        ListNode current = this.root;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    public int get(int index) {
        int n = 0;
        ListNode current = this.root;

        while (n < index) {
            n++;
            current = current.next;
        }
        return current.data;
    }

    public void print() {
        if (root == null) {
            System.out.print("<");
            System.out.print(">");
        } else {
            ListNode temp = root;
            System.out.print("<");
            while (temp != null) {
                if (temp == this.root) {
                    System.out.print(" root-> [" + temp.data + "]" + "--");
                } else {
                    System.out.print("[" + temp.data + "]");
                    System.out.print("--");
                }
                temp = temp.next;
            }
            System.out.print("[end] >");
        }
    }

    public void append(int data) {
        ListNode l = new ListNode(data);
        l.data = data;
        if (root == null)
            root = l;
        else {
            ListNode tmp = root;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = l;
        }

    }

    public void addBefore(int target, int value) {
        ListNode node = new ListNode(value);
        ListNode current = this.root;

        if (this.root.data == target) {
            this.prepend(value);
        }

        while (current.next.data != target) {
                current = current.next;
            }

            node.next = current.next;
            current.next = node;

        }



    public void insertAfter(int needle, int newValue) {
        ListNode node = new ListNode(newValue);
        ListNode current = this.root;
        while (current.data  != needle) {
            if (current.data == needle) {
                current = current.next;
            }

            node.next = current.next;
            current.next = node;

        }

    }
}