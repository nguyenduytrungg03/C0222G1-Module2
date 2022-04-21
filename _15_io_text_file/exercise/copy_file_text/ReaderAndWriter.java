package _15_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.LinkedList;
import java.util.List;

public class ReaderAndWriter {
    public static List<String> reader(String path) {
        File file = new File(path);
        List<String> list = new LinkedList<>();
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            try {
                while (true) {
                    if (!((line = bufferedReader.readLine()) != null && !line.equals(""))) break;
                    list.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


    public static void writer(String path, String line) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//    public static void main(String[] args) throws IOException {
//        File anime = new File("D:\\anime\\anime\\anime.jpg");
//        File byTrung = new File("D:\\byTrung\\anime.jpg");
//        Files.copy(anime.toPath(),byTrung.toPath(),StandardCopyOption.REPLACE_EXISTING);
//    }

