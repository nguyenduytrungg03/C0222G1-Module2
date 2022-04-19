package _10_stack_queue_java.exercise.use_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elbe";
        String[] arrString;
        arrString = string.split("");
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(arrString[i].toLowerCase());
            queue.offer(arrString[i].toLowerCase());
        }
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
