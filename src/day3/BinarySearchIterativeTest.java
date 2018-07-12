package day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchIterativeTest {

    @Test
    void numberSearchOne() {
        int[] arr = {4,8,15,16,23,42};
        int low = 0;
        int high = arr.length - 1;
        int value = 15;
        int expected = 4;
        int result = ArrayBinarySearch.BinarySearch(arr, value, low, high);

        assertEquals(expected, result);
        System.out.println("The number was found at index: " + result);
    }

    @Test
    void numberSearchTwo() {
        int[] arr = {11,22,33,44,55,66,77};
        int low = 0;
        int high = arr.length - 1;
        int value = 90;
        int expected = -1;
        int result = ArrayBinarySearch.BinarySearch(arr, value, low, high);

        assertEquals(expected, result);
        System.out.println("The number was found at index: " + result);
    }


}