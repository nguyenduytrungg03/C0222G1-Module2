package _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedList {
    LinkedList<Product> linkedList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public void display() {
        for (Product item : linkedList) {
            System.out.println(item);
        }
    }

    public void add() {
        System.out.println("Nhap ten:");
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        System.out.println("nhap gia: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        linkedList.add(new Product(name, price, id));


    }

    public void delete() {
        System.out.println("nhap id muon xoa ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < linkedList.size(); i++) {
            if (id == linkedList.get(i).getId()) {
                linkedList.remove(i);
            }
        }
    }


    public void edit() {
        System.out.println("Nhap id muon sua ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < linkedList.size(); i++) {
            if (id == linkedList.get(i).getId()) {
                System.out.println("nhap ten muon sua ");
                linkedList.get(i).setName(sc.nextLine());
                System.out.println("nhap gia muon sua");
                linkedList.get(i).setPrice(Integer.parseInt(sc.nextLine()));
            }
        }
    }

    public void find() {
        System.out.println("nhap ten muon tim");
        String name = sc.nextLine();
        for (Product item : linkedList) {
            if (item.getName().equals(name)) {
                System.out.println(item);
            } else {
                System.out.println("tim lai ten di");
            }
        }
    }


    public void sort(){
        Collections.sort(linkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
    }


    public void sort2(){
        Collections.sort(linkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice()-o1.getPrice();
            }
        });
    }
}
