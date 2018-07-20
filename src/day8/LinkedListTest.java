package day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void mergeLists() {
        LinkedList kk = new LinkedList();
        LinkedList nn = new LinkedList();

        kk.prepend(1);
        kk.prepend(22);
        kk.prepend(12);

        nn.prepend(8);
        nn.prepend(34);
        nn.prepend(13);


        LinkedList mergedList = new LinkedList();

        mergedList = mergedList.mergeLists(kk, nn);

        LinkedList mergedListExpected = new LinkedList();
        mergedListExpected.prepend(8);
        mergedListExpected.prepend(1);
        mergedListExpected.prepend(34);
        mergedListExpected.prepend(22);
        mergedListExpected.prepend(13);
        mergedListExpected.prepend(12);

        String result = mergedList.print();

        String expected = mergedListExpected.print();



        assertEquals(expected, result);
    }

}