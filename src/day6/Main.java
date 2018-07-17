package day6;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(55);
        ll.prepend(69);
        ll.append(99);

        ll.print();

        if (ll.isEmpty()) {
            System.out.println();
        }

    }
}


