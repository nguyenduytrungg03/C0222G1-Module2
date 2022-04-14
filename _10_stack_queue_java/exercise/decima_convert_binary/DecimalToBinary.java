package _10_stack_queue_java.exercise.decima_convert_binary;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhập số muốn đổi sang nhị phân: ");
        int num = sc.nextInt();
        while (num > 0) {
//            int a = num%2;
            stack.push(num%2);
            num = num/ 2;
        }
        System.out.print("Giá trị nhị phân là: ");
        while (!stack.isEmpty() )
        {
            System.out.print(stack.pop());
        }

    }
}
