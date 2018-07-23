package day6;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void prepend() {
        LinkedList ll = new LinkedList();
        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(55);
        ll.prepend(69);
        ll.append(99);


        String expected = "<[69]--[12]--[34]--[8]--[12]--[34]--[8]--[55]--[99]--[end]>";

        assertEquals(expected, ll.print());


    }

    @Test
    void append() {
        LinkedList ll = new LinkedList();

        ll.append(55);
        ll.append(99);

        String expected = "<[55]--[99]--[end]>";
        assertEquals(expected, ll.print());

    }

    @Test
    void addBefore() {
        LinkedList ll = new LinkedList();
        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.prepend(69);
        ll.addBefore(8, 88);

        String expected = "<[8]--[69]--[12]--[34]--[8]--[end]>";
        assertEquals(expected, ll.print());

        }
    }
