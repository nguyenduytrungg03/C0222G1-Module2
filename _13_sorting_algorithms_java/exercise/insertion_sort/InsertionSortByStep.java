package _13_sorting_algorithms_java.exercise.insertion_sort;


import java.util.Arrays;

public class InsertionSortByStep {
    static int[] list = {1, 3, 2, 5, 6};


    public static void main(String[] args) {
        System.out.println("Mảng ban đầu: ");
        System.out.println(Arrays.toString(list));
        System.out.println("Bắt đầu quá trình sắp xếp: ");
        insertionSort(list);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {

            System.out.println("current Element ở vòng lặp thứ: " + i);

            int currentElement = list[i];

            System.out.println("current Element = " + currentElement);

            int k;

//            Duyệt for mảng con từ k= i -1 với điều kiện k >= 0 và phần tử thứ k phải lớn hơn phần tử hiện tại

            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {

//        Tiến hành gán phần tử tiếp theo bắt đầu từ k bằng list[k] và thực hiện đến khi k < 0 hoặc list[k] < currentElemet
                list[k + 1] = list[k];
                System.out.println("Phần tử tại index: " + (k + 1) + " sau khi được gán = " + list[k + 1]);


                System.out.println("Mảng sau khi đã sắp xếp lại mảng con:");

                System.out.println(Arrays.toString(list));

            }
            System.out.println("j khi ra khỏi for trong = " + k);

            System.out.println("Phần tử tại index " + (k + 1) + " được gán lại = " + currentElement);

            list[k + 1] = currentElement;

            System.out.println( "Mảng sau khi kết thúc vòng lặp thứ: " + i);

            System.out.println(Arrays.toString(list));

        }
    }



}

