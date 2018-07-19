package day8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList kk = new LinkedList();
        LinkedList nn = new LinkedList();
        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(55);
        ll.prepend(69);
        ll.append(99);
        ll.addBefore(12, 22);
        ll.kthElement(3);
        ll.print();

        kk.prepend(1);
        kk.prepend(22);
        kk.prepend(12);

        kk.print();

        nn.prepend(8);
        nn.prepend(34);
        nn.prepend(13);

        nn.print();

        LinkedList newy = new LinkedList();

        newy.mergeLists(kk, nn);
        newy.print();


        if (ll.isEmpty()) {
            System.out.println();
        }

    }
}


