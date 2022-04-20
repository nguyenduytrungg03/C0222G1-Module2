package _14_debug_java.exercise.use_class_illegaltriangleexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 3 cạnh tam giác");
        boolean flag = true;
        while (flag){
            try {
                flag =false;
                System.out.println("nhập cạnh t1: ");
                int side1 = Integer.parseInt(sc.nextLine());
                System.out.println("nhập cạnh t2: ");
                int side2 = Integer.parseInt(sc.nextLine());
                System.out.println("nhập cạnh t3: ");
                int side3 = Integer.parseInt(sc.nextLine());

                if ((side1 + side2) < side3 && (side2 + side3) < side1 && (side3 + side1) < side2) {
                    flag=true;
                    throw new IllegalTriangleException(" Không phải là tam giác");
                }if (side1<=0 || side2<=0|| side3<=0){
                    flag=true;
                    throw new IllegalTriangleException(" không phải là tam giác");
                }else {
                    throw new IllegalTriangleException("Là tam giác");
                }
            }catch (NumberFormatException e){
                System.err.println(e.getMessage()+  "Nhập lại số đi.");
                flag = true;
            }catch (IllegalTriangleException e){
                System.err.println(e.getMessage());
                flag= true;
            }

        }
        }



}
