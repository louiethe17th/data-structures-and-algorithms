package day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void reserve() {
        LinkedList ll = new LinkedList();

        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(55);
        ll.prepend(69);
        ll.append(99);
        ll.addBefore(12, 22);

        ll.reverse();


        assertEquals("<[99]--[55]--[8]--[34]--[12]--[69]--[12]--[end]>", ll.print());
    }

}