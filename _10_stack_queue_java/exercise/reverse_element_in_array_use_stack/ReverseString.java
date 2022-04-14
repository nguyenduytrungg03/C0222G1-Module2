package _10_stack_queue_java.exercise.reverse_element_in_array_use_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string2 = "";
        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập chuỗi: ");
        String arrString = sc.nextLine();
        System.out.println(arrString);
        String[] mWord = arrString.split(" ");
        System.out.println(Arrays.toString(mWord));

        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }

        for (int i = 0; i <= wStack.size(); i++) {
            string2 += wStack.pop()+ " ";
        }
        System.out.println(string2);
    }


}
