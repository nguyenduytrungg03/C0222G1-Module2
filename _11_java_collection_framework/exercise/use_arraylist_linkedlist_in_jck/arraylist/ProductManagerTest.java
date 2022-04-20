package _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.arraylist;

import java.util.Scanner;

public class ProductManagerTest {
    public static void main(String[] args) {
        displayMenu();

    }

    public static void displayMenu() {
        ProductManager productManager = new ProductManager();
        boolean check = true;
        while (check) {
            System.out.println("---Menu---");
            System.out.println("1.Them san pham");
            System.out.println("2.Sua san pham");
            System.out.println("3.Xoa san pham");
            System.out.println("4.Hien thi san pham");
            System.out.println("5.Tim san pham");
            System.out.println("6.Sap xep lai san pham theo thu tu tang dan");
            System.out.println("7.Sap xep lai san pham theo thu tu giam dan");
            System.out.println("enter number: ");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                   productManager.editId();
                    break;
                case 3:
                    productManager.deleteId();
                    break;
                case 4:
                    ProductManager.display();
                    break;
                case 5:
                    productManager.findId();
                    break;
                case 6:
                    productManager.sortAscending();
                    break;
                case 7:
                    productManager.sortDecrease();
                    break;

            }

        }
    }

}
