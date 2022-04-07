package _01_introduction_java.exercise;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền usd: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("giá trị VND " + quydoi);
    }
}
