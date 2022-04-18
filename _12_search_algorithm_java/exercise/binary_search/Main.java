package _12_search_algorithm_java.exercise.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Main extends BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("phần tử thứ " + i);

            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Nhập phần tử muốn tìm: ");

        int value = sc.nextInt();

        int index = binarySearch(array, 0, array.length - 1, value); // duyệt từ vị trí từ đầu mảng tới cuối mảng

        System.out.println("Phần tử vừa nhập vào nằm ở vị trí thứ: " + index);

    }
}
