package day10;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(55);
        ll.prepend(69);
        ll.append(99);
        ll.addBefore(12, 22);
        ll.kthElement(3);
        ll.print();

        ll.reverse();

        ll.print();






        if (ll.isEmpty()) {
            System.out.println();
        }

    }
}


