public class minSubarray {
    public static void main(String[] args) {
        int[] testArray = {18, 6, 66, 44, 9, 22, 14};
        indexofMinimum(testArray, 2);
    }

    public static void indexofMinimum(int[] array, int startIndex) {
        int minIndex;
        int minValue;

        minIndex = startIndex;
        minValue = array[startIndex];

        for (int i = minIndex; i < array.length-1; i++) {
            if (minValue > array[i+1]){
                minIndex = i+1;
                minValue = array[i+1];
            }
        }
        System.out.println("The index of the minimum value of the subarray starting at index " + startIndex + " is " + minIndex + ".");
    }
}