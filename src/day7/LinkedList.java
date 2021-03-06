package day7;

import day6.ListNode;

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
//        System.out.println(total);
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

    public String print() {
        String goodOutput = "";
        if (root == null) {
            System.out.print("<");
            System.out.print(">");
            String output = "<>";
            return output;
        } else {
            ListNode temp = root;
            System.out.print("<");
            goodOutput = "<";
            while (temp != null) {
                if (temp == this.root) {
                    System.out.print("[" + temp.data + "]" + "--");
                    goodOutput = goodOutput + "[" + temp.data + "]" + "--";
                } else {
                    System.out.print("[" + temp.data + "]");
                    System.out.print("--");
                    goodOutput = goodOutput + "[" + temp.data + "]" + "--";
                }
                temp = temp.next;
            }
            System.out.print("[end]>\n");
            goodOutput = goodOutput + "[end]>\n";
        }
        return goodOutput;
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

    public void addBefore(int el, int n) {
        ListNode newNode = new ListNode(n);

        if (null == root || newNode.data == root.data) {
            append(el);
        } else {
            ListNode parent = null;
            ListNode current = this.root;
            while (null != current && current.data != newNode.data) {
                parent = current;
                current = current.next;
            }
            if (null != current) {
                current.next = new ListNode(newNode.data);
            } else {
                prepend(el);
            }
        }
    }

    public int kthElement (int k) {
        int length = this.size();

        if (length <= 0){
            System.out.println("LL is empty");
            return 0;
        }


        if(length<k){
            System.out.println("the K is longer than the list");
            return 0;

        }

        ListNode temp = this.root;

        for (int i = 1; i < length - k+1; k++){
            temp = temp.next;
        }
        System.out.println("The kTh element from the end is: " + temp.data);

        return temp.data;
    }
}