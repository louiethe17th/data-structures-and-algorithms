package day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void kthElement() {
        LinkedList ll = new LinkedList();
        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(55);
        ll.prepend(69);
        ll.append(99);
        ll.addBefore(12, 22);
        ll.print();

        int expected = 34;

        assertEquals(expected, ll.kthElement(4));
    }

    @Test
    void kthElementLongerThanArray() {
        LinkedList ll = new LinkedList();
        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(55);
        ll.prepend(69);
        ll.append(99);
        ll.addBefore(12, 22);
        ll.print();

        int expected = 0;

        assertEquals(expected, ll.kthElement(10));
    }

    @Test
    void kthElementLongerEmptyLL() {
        LinkedList ll = new LinkedList();


        int expected = 0;

        assertEquals(expected, ll.kthElement(10));
    }
}