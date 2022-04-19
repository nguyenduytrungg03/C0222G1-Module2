package _13_sorting_algorithms_java.exercise.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6};

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
    public static void main(String[] args) {
        insertionSort(list);
        System.out.print(Arrays.toString(list));

    }
}

