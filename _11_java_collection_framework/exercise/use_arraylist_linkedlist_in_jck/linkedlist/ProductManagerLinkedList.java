package _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedList {
    LinkedList<Product> linkedList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);


    public void addProduct() {
        System.out.println("Nhap ten:");
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        System.out.println("nhap gia: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        linkedList.add(new Product(name, price, id));
        System.out.println("Thêm thành công.!!");

    }

    public void editId() {
        boolean flag = true;
        System.out.println("Nhap id muon sua ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < linkedList.size(); i++) {
            if (id == linkedList.get(i).getId()) {
                System.out.println("nhap ten muon sua ");
                linkedList.get(i).setName(sc.nextLine());
                System.out.println("nhap gia muon sua");
                linkedList.get(i).setPrice(Integer.parseInt(sc.nextLine()));
                System.out.println("sua thanh cong");
                flag = false;
                break;
            }
            if (flag) {
                System.out.println("Nhập lại: ");
            }
        }
    }

    public void deleteId() {
        System.out.println("nhap id muon xoa ");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (int i = 0; i < linkedList.size(); i++) {
            if (id == linkedList.get(i).getId()) {
                linkedList.remove(i);
                flag = false;
                break;
            }
            if (flag) {
                System.out.println("không tìm thấy id nhập lại đi!!");
            }
        }
    }


    public void display() {
        for (Product item : linkedList) {
            System.out.println(item);
        }
    }

    public void findName() {
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


    public void sortAscending() {
        Collections.sort(linkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }


    public void sort2Decrease() {
        Collections.sort(linkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }
}
