import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] testArray = {22, 11, 99, 88, 9, 7, 42};
        selectionSort(testArray);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i <array.length-1; i++) {
            swap(array,i,indexofMinimum(array,i));
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int x;
        x = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = x;
    }

    public static int indexofMinimum(int[] array, int startIndex) {
        int minIndex;
        int minValue;

        minIndex = startIndex;
        minValue = array[startIndex];

        for (int i = minIndex; i < array.length - 1; i++) {
            if (minValue > array[i + 1]) {
                minIndex = i + 1;
                minValue = array[i + 1];
            }
        }
        return minIndex;
    }
}

