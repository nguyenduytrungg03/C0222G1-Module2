package _03_array_java.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        int index = 0;
        System.out.println("Nhập phần tử muốn xóa :");
//        int x = sc.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                index = i;
//            }
//        }
//
//        for (int i = index; i < array.length; i++) {
//            if (i < array.length - 1) {
//                array[i] = array[i + 1];
//            }
//        }
//        array[array.length-1]=0;
        System.out.println(Arrays.toString(remoteElementArr(array,index)));
//        System.out.println(Arrays.toString(remoteElementArr(array,k,index)));
    }
    public static int [] remoteElementArr (int[]array, int index){
        int x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        for (int i = index; i < array.length; i++) {
            if (i < array.length - 1) {
                array[i] = array[i + 1];
            }
        }
        array[array.length-1]=0;
        return array;
    }
}