package _03_array_java.practice;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] student = {"Trung", "Hiếu", "Hoàng", "Hảo", "Duy", "Cường", "Uyên"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name student: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("vị trí của sinh viên trong danh sách" + input_name + " là :" + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy " + input_name + "trong danh sách ");
        }
    }
}
