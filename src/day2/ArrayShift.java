package day2;

import java.util.Arrays;

public class ArrayShift {
    public static void insertShiftArray(int[] arr, int n) {


        int nn = arr.length;

        int[] a = new int[(nn + 1)/2];
        int[] b = new int[nn - a.length];

        for (int i = 0; i < nn; i++)
        {
            if (i < a.length) {
                a[i] = arr[i];
            } else
                b[i - a.length] = arr[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
