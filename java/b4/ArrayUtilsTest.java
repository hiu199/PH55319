package b4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    ArrayUtils arrayUtils = new ArrayUtils();

    @Test
    void testGetElementValidIndex() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, arrayUtils.getElementAtIndex(array, 2));
    }

    @Test
    void testGetElementAtNegativeIndex() {
        int[] array = {1, 2, 3, 4, 5};
        Exception exception = assertThrows(IndexOutOfBoundsException.class,
                () -> arrayUtils.getElementAtIndex(array, -1));
        assertEquals(" nằm ngoài phạm vi của mảng!", exception.getMessage());
    }

    @Test
    void testGetElementAtOutOfBoundIndex() {
        int[] array = {1, 2, 3, 4, 5};
        Exception exception = assertThrows(IndexOutOfBoundsException.class,
                () -> arrayUtils.getElementAtIndex(array, 5));
        assertEquals(" nằm ngoài phạm vi của mảng!", exception.getMessage());
    }

    @Test
    void testGetElementAtLastIndex() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(50, arrayUtils.getElementAtIndex(array, 4));
    }
}
