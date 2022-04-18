package _10_stack_queue_java.exercise.use_stack;

import java.util.Scanner;
import java.util.Stack;

public class Demerging {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Stack<Character> bStack = new Stack<>();
            System.out.println("Nhập vào biểu thức: ");
            String str = sc.nextLine();
            char left = ' ';
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    bStack.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    if (bStack.isEmpty()) {
                        flag = true;
                    } else {
                        left = bStack.pop();
                    }
                    if (left != '(') {
                        flag = true;
                    }
                }
            }
            if (bStack.isEmpty()) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
}






