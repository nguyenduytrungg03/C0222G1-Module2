package _04_class_java.practice.Rectangle2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("nhập chiều dài :");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều cao :");
        double hight = sc.nextDouble();
        Rectangle2 rc = new Rectangle2(width,hight);
        System.out.println(rc.display());
        System.out.println("Chu vi hình chữ nhật :" +rc.getPerimeter());
        System.out.println("Diện tích hình chữ nhật :"+rc.getArea());
    }
}
