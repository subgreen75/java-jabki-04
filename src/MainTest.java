import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void spaceR() {
        Assertions.assertEquals("1  ",Main.space(1,3,'R'));
    }

    @Test
    void spaceL() {
        Assertions.assertEquals("  1",Main.space(1,3,'L'));
    }

    @Test
    void getMonthName() {
        Assertions.assertEquals("Январь",Main.getMonthName(1));
    }

    @Test
    void getSumOneDim() {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        Assertions.assertEquals(3,Main.getSum(arr));
    }

    @Test
    void getSumTwoDim() {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        Assertions.assertEquals(10,Main.getSum(arr));
    }

    @Test
    void getMinOneDim() {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = -2;
        Assertions.assertEquals(-2,Main.getMin(arr));
    }

    @Test
    void GetMinTwoDim() {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = -3;
        arr[1][1] = 4;
        Assertions.assertEquals(-3,Main.getMin(arr));
    }

    @Test
    void getMaxOneDim() {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = -2;
        Assertions.assertEquals(1,Main.getMax(arr));
    }

    @Test
    void GetMaxOneDim() {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = -3;
        arr[1][1] = 4;
        Assertions.assertEquals(4,Main.getMax(arr));
    }

    @Test
    void getInvertedArray() {
        int[] actual = {1, 2};
        int[] inverted = {2, 1};
        assertArrayEquals(inverted, Main.getInvertedArray(actual));
    }

    @Test
    void countRepeatingElements() {
        int[] actual = {1, 2, 3, 4, 2, 1};
        Assertions.assertEquals(4,Main.countRepeatingElements(actual));
    }

    @Test
    void getIndexesRepeatingElements() {
        int[] actual = {1, 2, 3, 4, 2, 1};
        Assertions.assertEquals("[0,1,4,5]",Main.getIndexesRepeatingElements(actual));
    }

    @Test
    void replaceNegativeValuesArray() {
        int[] actual = {1, -2};
        int[] converted = {1, 2};
        assertArrayEquals(converted, Main.replaceNegativeValuesArray(actual));
    }
}