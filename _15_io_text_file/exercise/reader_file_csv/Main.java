package _15_io_text_file.exercise.reader_file_csv;

import _05_access_modifier_static_java.exercise.class_write_java.Student;
import _15_io_text_file.exercise.copy_file_text.ReaderAndWriter;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Country> myList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        display();
    }

    public static void display() throws IOException {
        List<String[]> list = ReaderFile.readFile("_15_io_text_file/exercise/reader_file_csv/countries.csv");
        for (String[] item: list) {
            myList.add(new Country(Integer.parseInt(item[0]),item[1],item[2]));
        }
        for ( Country item: myList) {
            System.out.println(item.toString());
        }
    }
//    public static void display() throws IOException {
//        List<String[]> list = ReaderFile.readFile("_15_io_text_file/exercise/reader_file_csv/countries.csv");
//        for (String[] item: list) {
//           myList.add(new Country(Integer.parseInt(item[0]),item[1],item[2]));
//        }
//        for ( Country item: myList) {
//            System.out.println(item.toString());
//        }
//    }
}
