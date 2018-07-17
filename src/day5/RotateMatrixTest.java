package day5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    @Test
    void rotate() {
        int n = 3;
        int arr[][] =
                {
                        {1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3}
                };
        int expectedArr[][] = {
                {3, 2, 1},
                {3, 2, 1},
                {3, 2, 1}
        };

        String result = Arrays.deepToString(RotateMatrix.Rotate(n, arr));
        String expected = Arrays.deepToString(expectedArr);

        assertEquals(expected, result);



    }
}