package day3;


public class ArrayBinarySearch {


    public static int BinarySearch(int[] arr, int value, int low, int high) {

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (value < arr[middle]) {
                high = middle - 1;

            } else if (value > arr[middle]) {
                low = middle +1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}