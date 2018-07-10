import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

class D01_ArrayReverseTest {

    @Test
    public void testEmpty() throws Exception {
        int[] numbers = {};
        D01_ArrayReverse.doubler(numbers);

        int[] expected = {};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testDoubler() throws Exception {
        int[] numbers = {4, 1, 6, 2, 9};
        D01_ArrayReverse.doubler(numbers);

        int[] expected = {8, 2, 12, 4, 18};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testReverse() throws Exception {
        int[] numbers = {5, 1, 7, 2, 5};
        D01_ArrayReverse.reverse(numbers);

        int[] expected = {5, 2, 7, 1, 5};
        assertArrayEquals(expected, numbers);
    }
}