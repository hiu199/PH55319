package b4;

public class ArrayUtils {


    public int getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Chỉ mục nằm ngoài phạm vi của mảng!");
        }
        return array[index];
    }
}
