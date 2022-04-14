package _10_stack_queue_java.exercise.reverse_element_in_array_use_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> arrStack = new Stack<>();
        System.out.println("Nhập size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("phần tử thứ " + i);

            arr[i] = arrStack.push(sc.nextInt());

        }
        System.out.println("Mảng hiện tại: ");
        System.out.println(arrStack);

        for (int i = 0; i < size; i++) {

            arr[i] = arrStack.pop();

        }
        System.out.println("Mảng sau khi đảo ngược: ");
        System.out.println(Arrays.toString(arr));
    }
}



