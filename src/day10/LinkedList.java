package day10;

import org.w3c.dom.NodeList;

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
            goodOutput = goodOutput + "[end]>";
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

    public void kthElement(int k) {
        int length = this.size();

        if (length < k) {
            System.out.println("the K is longer than the list");
        }

        ListNode temp = this.root;

        for (int i = 1; i < length - k + 1; k++) {
            temp = temp.next;
        }
        System.out.println("The kTh element from the end is: " + temp.data);
    }

    public LinkedList mergeLists(LinkedList a, LinkedList b) {
        LinkedList mergedList = new LinkedList();
        ListNode current1 = a.root;
        ListNode current2 = b.root;

        mergedList.append(current1.data);

        mergedList.print();

        int aLength = a.size();
        int bLength = b.size();

        int longestList = 0;

        if (aLength > bLength) {
            longestList = aLength;
        } else {
            longestList = bLength;
        }

        for (int i = 1; i < longestList; i++) {
            mergedList.append(current2.data);
            current2 = current2.next;
            mergedList.print();
            mergedList.append(current1.next.data);
            current1 = current1.next;
            mergedList.print();
        }

        return mergedList;

    }

    public boolean hasLoop() {

        if (this.root != null) {
            ListNode c1 = this.root;
            ListNode c2 = this.root;

            Boolean loop = null;

            while (c1.next != null || c2.next.next != null) {


                c1 = c1.next;
                c2 = c2.next.next;


                if (c1.data == c2.data) {
                    loop = true;
                    break;
                } else if (c1 == null || c2 == null || c2.next == null || c2.next.next == null) {
                    loop = false;
                    break;
                }

            }

            return loop;

        } else {

            return false;
        }
    }

    public LinkedList reverse(){
        ListNode prev = null;
        ListNode current = this.root;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        this.root = prev;
        return this;

    }
}