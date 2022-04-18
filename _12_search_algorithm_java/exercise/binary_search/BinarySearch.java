package _12_search_algorithm_java.exercise.binary_search;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle;
        if (right >= left) {
            middle = left + (right - left) / 2;
            if (array[middle] == value) {
                return middle;
            }

            if (array[middle] > value) {
                return binarySearch(array, left, middle - 1, value);
            } else {
                return binarySearch(array, middle + 1, right, value);
            }
        }
        return -1;
    }

}
