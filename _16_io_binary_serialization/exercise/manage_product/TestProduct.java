package _16_io_binary_serialization.exercise.manage_product;

import java.io.IOException;
import java.util.Scanner;

public class TestProduct {

    public static void main(String[] args) throws IOException {
        displayMenu();
    }

    public static void displayMenu() throws IOException {
        ProductManager productManager = new ProductManager();
        boolean check = true;
        while (check) {
            System.out.println("---Menu---");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Tìm sản phẩm");
            System.out.println("3.Hiển thị sản phẩm");
            System.out.println("4.Exit");
            System.out.println("enter number:");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    productManager.addNewProduct();
                    break;
                case 2:
                    productManager.findName();
                    break;
                case 3:
                    productManager.display();
                    break;
                case 4:
                    System.exit(4);
            }
        }
    }
}