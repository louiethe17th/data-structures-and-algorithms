package day5;

public class RotateMatrix {


     public static int[][]  Rotate(int n, int arr[][]) {

        for(int row = 0; row < n / 2; row++){

            for (int col = row; col < n-row-1; col++){

                 int temp = arr[row][col];

                 arr[row][col] = arr[col][n-1-row];
                 arr[col][n-1-row] = arr[n-1-col][row];
                 arr[n-1-col][row] = temp;
            }
        }

        return arr;
    }
}
