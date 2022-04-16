package _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.arraylist;

import _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.arraylist.Product;

import java.util.*;

public class ProductManager {
    public static Scanner sc = new Scanner(System.in);
    public static List<Product> arrayList = new ArrayList<>();



    public static void display() {
        for (Product item: arrayList) {
            System.out.println(item.toString());
        }
    }


    public static void add() {
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        System.out.println("nhap gia: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        arrayList.add(new Product(name,price,id));
    }


    public static void delete(){
        System.out.println("nhap id muon xoa ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <arrayList.size() ; i++) {
            if (id==arrayList.get(i).getId()){
                arrayList.remove(i);
            }
        }
    }


    public  static  void edit(){
        System.out.println("Nhap id muon sua ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <arrayList.size() ; i++) {
            if (id== arrayList.get(i).getId()){
                System.out.println("nhap ten muon sua ");
                arrayList.get(i).setName(sc.nextLine());
                System.out.println("nhap gia muon sua");
                arrayList.get(i).setPrice(Integer.parseInt(sc.nextLine()));
            }else{
                System.out.println("nhap lai di be oi");
            }
        }
    }


    public static void find(){
        System.out.println("Nhap ten muon tim");
        String name = sc.nextLine();
        for (Product item: arrayList) {
            if (item.getName().equals(name)){
                System.out.println(item);
            } else {
                System.out.println("tim lai ten di");
            }
        }
    }


    public static void sort(){
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
    }
    public static void sort1(){
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice()-o1.getPrice();
            }
        });
    }


}










