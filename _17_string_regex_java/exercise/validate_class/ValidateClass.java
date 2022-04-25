package _17_string_regex_java.exercise.validate_class;

import java.util.Scanner;

import java.util.regex.Pattern;

public class ValidateClass {
    public static final String REGEX_NAME_CLASS = "^[CPA]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String name = scanner.nextLine();
        boolean check = Pattern.matches(REGEX_NAME_CLASS, name);
        if (check) {
            System.out.println("ten hop le");
        } else {
            System.out.println("ten kh hop le");
        }
    }
}
//    ^[CPA]\\d{4}[GHIKLM]$

