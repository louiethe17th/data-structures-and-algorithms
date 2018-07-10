public class D01_ArrayReverse {
    public static void doubler(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void reverse(int[] arr) {
        for(int i = 0; i<arr.length/2; i++) {
            int newArr = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = newArr;
        }
    }
}
