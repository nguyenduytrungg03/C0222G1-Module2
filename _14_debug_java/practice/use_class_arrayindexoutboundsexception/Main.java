package _14_debug_java.practice.use_class_arrayindexoutboundsexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập 1 phần tử bất kì: ");
        int x = sc.nextInt();
        try{
            System.out.println("giá trị của phần tử có chỉ số 5 " + x + arr[x] );
        }catch (InputMismatchException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
