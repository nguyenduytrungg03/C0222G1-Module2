package _16_io_binary_serialization.exercise.manage_product;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Serializable {
    public static Scanner sc = new Scanner(System.in);
    public static List<Product> objectList = new ArrayList<>();
    static final String SOURCE_FILE = "_16_io_binary_serialization/exercise/manage_product/product.txt";


    static {
        Product product1 = new Product(1, "Iphone", "APPLE", 1000, "good");
        Product product2 = new Product(2, "Samsung", "ADR", 500, "BAD");
        Product product3 = new Product(3, "Vetur", "ADR", 12000, "VIPPRO");
        objectList.add(product1);
        objectList.add(product2);
        objectList.add(product3);
    }

    public void display() throws IOException {
        objectList = (List<Product>) ReaderAndWriteBinary.readFileBinary(SOURCE_FILE);
        for (Product item : objectList) {
            System.out.println(item);
        }
    }

    public void addNewProduct() throws IOException {
        objectList = (List<Product>) ReaderAndWriteBinary.readFileBinary(SOURCE_FILE);
        System.out.println("nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên: ");
        String name = sc.nextLine();
        System.out.println("nhập tên hãng: ");
        String producer = sc.nextLine();
        System.out.println("nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("nhập mô tả: ");
        String descriptions = sc.nextLine();
        Product product = new Product(id, name, producer, price, descriptions);
        objectList.add(product);
        ReaderAndWriteBinary.writeFileBinary("_16_io_binary_serialization/exercise/manage_product/product.txt", objectList);
        System.err.println("thêm thành công");
    }

    public void findName() throws IOException {
        objectList = (List<Product>) ReaderAndWriteBinary.readFileBinary(SOURCE_FILE);
        System.out.println("Nhập tên muốn tìm: ");
        String name = sc.nextLine();
        boolean flag = true;
        for (Product item : objectList) {
            if (item.getName().contains(name)) {
                flag = false;
                System.out.println(item);
            }
        }
        if (flag) {
            System.err.println("không tìm thấy tên");
        }
    }


}
