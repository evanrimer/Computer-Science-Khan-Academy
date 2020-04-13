import java.util.Arrays;

public class implementSwap {

    public static void main(String[] args) {
    int [] testArray = {7, 9, 4};
    swap(testArray, 0, 1);
        System.out.println(Arrays.toString(testArray));
    }
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int x;
        x = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = x;
    }
}

