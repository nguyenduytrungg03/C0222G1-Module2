package _10_stack_queue_java.exercise.count_element_in_string_by_map;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bất kì: ");
        String string = sc.nextLine().toLowerCase();
        String[] newString = string.split(" "); //
        System.out.println(Arrays.toString(newString));
        int count = 1;
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < newString.length; i++) {
                if (treeMap.containsKey(newString[i]))
            {
                treeMap.put(newString[i], treeMap.get(newString[i]) + 1);
            } else {
                treeMap.put(newString[i], 1);
            }
        }
        System.out.println(treeMap);
    }
    }




