package _02_loop_java.exercise;

import java.util.Scanner;

public class ShowImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. vẽ hình chữ nhật : ");
        System.out.println("2. vẽ tam giác đỉnh in bên trái :");
        System.out.println("3. vẽ tam giác đỉnh dưới bên trái :");
        System.out.println("4. vẽ tam giác in bên phải :");
        System.out.println("5. vẽ tam giác đỉnh dưới in bên phải :");
        System.out.println("6. vẽ tam giác cân :");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 1; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                    for (int i = 1; i < 5; i++) {
                        for (int a = 5; a > i; a--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");

                    }
            }


        }
    }
}
