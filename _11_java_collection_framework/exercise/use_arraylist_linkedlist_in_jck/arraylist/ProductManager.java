package _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.arraylist;

import _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.arraylist.Product;

import java.util.*;

public class ProductManager {
    public static Scanner sc = new Scanner(System.in);
    public static List<Product> arrayList = new ArrayList<>();

    static {
        Product product1 = new Product("merinda", 10000, 1);
        Product product2 = new Product("merinda1", 10000, 2);
        Product product3 = new Product("merinda2", 10000, 3);
        arrayList.add(product1);
        arrayList.add(product2);
        arrayList.add(product3);
    }


    public void addProduct() {
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        System.out.println("nhap gia: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        arrayList.add(new Product(name, price, id));
        System.out.println("them thanh cong");
    }

    public void editId() {
        System.out.println("Nhap id muon sua ");
        int id = Integer.parseInt(sc.nextLine()); //3
        boolean flag = true;

        for (int i = 0; i < arrayList.size(); i++) {  //  1 2 3
            if (id == arrayList.get(i).getId()) {
                System.out.println("nhap ten muon sua ");
                arrayList.get(i).setName(sc.nextLine());
                System.out.println("nhap gia muon sua");
                arrayList.get(i).setPrice(Integer.parseInt(sc.nextLine()));
                System.out.println("sua thanh cong");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("nhap lai");
        }
    }


    public void deleteId() {
        System.out.println("nhap id muon xoa ");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (id == arrayList.get(i).getId()) {
                arrayList.remove(i);
                flag = false;
                System.out.println("xoa thanh cong");
                break;
            }
        }
        if (flag) {
            System.out.println("xoa khong thanh cong tim khong ra id");
        }
    }
    public static void display() {
        for (Product item : arrayList) {
            System.out.println(item.toString());
        }
    }



    public void findId() {
        System.out.println("Nhap ten muon tim");
        String name = sc.nextLine();
        for (Product item : arrayList) {
            if (item.getName().contains(name)) {
                System.out.println(item);
            }
        }
    }


    public void sortAscending() {
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    public void sortDecrease() {
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }


}










