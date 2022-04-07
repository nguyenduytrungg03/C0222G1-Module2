package _03_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class NhapVaHienThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử trong mảng:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("phần tử thứ " + i);
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
