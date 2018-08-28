package day36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    public void sort() {

        int arr[] = {12, 11, 13, 5, 6, 7};


        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);


        int exp[] = {5, 6, 7, 11, 12};

        String result = MergeSort.printArray(ob);
        String expected = exp.toString();

        assertEquals(expected, result);


    }
}
