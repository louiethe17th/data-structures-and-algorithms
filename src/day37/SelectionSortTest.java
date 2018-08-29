package day37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    public void selectionSort() {


        int[] arr = {10,34,2,56,7,67,88,42};
        int[] arr2 = {11, 12, 22, 25, 64};

        long start = System.currentTimeMillis();
        int[] result = SelectionSort.SelectionSort(arr);
        long delta = System.currentTimeMillis() - start;
        System.out.println(delta);


        for(int i:result){
            System.out.print(i);
            System.out.print(", ");
        }


    }

    @Test
    public void selectionSort100000() {


        int[] arr = SelectionSort.randomArray(10000);

        long start = System.currentTimeMillis();
        int[] result = SelectionSort.SelectionSort(arr);
        long delta = System.currentTimeMillis() - start;
        System.out.println(delta);

        for(int i:result){
            System.out.print(i);
            System.out.print(", ");
        }


    }
}