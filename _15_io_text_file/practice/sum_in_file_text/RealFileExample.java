package _15_io_text_file.practice.sum_in_file_text;

import java.io.*;
import java.util.Scanner;

public class RealFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("file kh tồn tại hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();


        RealFileExample realFileEx = new RealFileExample();
        realFileEx.readFileText(path);
    }
}
