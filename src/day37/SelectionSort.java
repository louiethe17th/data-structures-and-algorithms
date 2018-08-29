package day37;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Random;

public class SelectionSort {

    public static int[] SelectionSort(int[] arr){


        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i+1; j < arr.length; j++){
                if ( arr[j] < arr[index]) {
                    index = j;
                }



            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static String printArray(int arr[]) {
        String array = null;
        int n = arr.length;

        for (int i=0; i < arr.length; ++i) {
            array += arr[i] + " ";
        }
        System.out.println(array);
        return array;
    }

    public static int[] randomArray(int n){
        int [] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1000000) + 1;
        }

        return array;
    }
}
