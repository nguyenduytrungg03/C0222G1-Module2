package _03_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int number=24;
        changeValuePassByValue(number);
        System.out.println(number);
    }
    static void changeValuePassByValue(int num){
         num=1;
    }
}
