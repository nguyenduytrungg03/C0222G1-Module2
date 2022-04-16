package _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.linkedlist;

import java.util.Scanner;

public class ProductManagerLinkedListTest  {
    public static void main(String[] args) {
    displayMenu();
    }
    public static void displayMenu(){
        ProductManagerLinkedList productManagerLinkedList = new ProductManagerLinkedList();
        boolean check = true;
        while (check){
            System.out.println("-----Menu-----");
            System.out.println("1.Them san pham");
            System.out.println("2.Sua san pham");
            System.out.println("3.Xoa san pham");
            System.out.println("4.Hien thi san pham");
            System.out.println("5.Tim san pham");
            System.out.println("6.Sap xep lai san pham theo thu tu tang dan");
            System.out.println("7.Sap xep lai san pham theo thu tu giam dan");
            System.out.println("enter number: ");
            Scanner scanner= new Scanner(System.in);

            switch (scanner.nextInt()){
                case 1:
                    productManagerLinkedList.add();
                    System.out.println("them thanh cong");
                    break;
                case 2:
                    productManagerLinkedList.edit();
                    break;
                case 3:
                    productManagerLinkedList.delete();
                    System.out.println("xoa thanh cong");
                    break;
                case 4:
                    productManagerLinkedList.display();
                    break;
                case 5:
                    productManagerLinkedList.find();
                    break;
                case 6:
                    productManagerLinkedList.sort();
                    break;
                case 7:
                    productManagerLinkedList.sort2();
                    break;
            }
        }
    }
}
